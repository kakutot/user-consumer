package com.larecette.kafka.consumer;

import com.larecette.kafka.EventType;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.WakeupException;

import java.util.Collections;
import java.util.Properties;

@Slf4j
public abstract class BaseKafkaConsumer<K, V>  extends KafkaConsumer<K, V> {
    private final static int MAX_NO_MESSAGE_FOUND_COUNT = 1000;

    @Getter
    private EventType eventType;

    public BaseKafkaConsumer(Properties properties, EventType eventType) {
        super(properties);
        this.eventType = eventType;
    }

    public BaseKafkaConsumer(Properties properties) {
        super(properties);
    }

    protected abstract String getTopicName();

    protected abstract void resolveAction(ConsumerRecord<K, V> consumerRecord);

    private BaseKafkaConsumer<K, V> getMe() {
        return this;
    }

    private void registerShutdownHook() {
        final Thread mainThread = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            getMe().wakeup();
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }

    public void startConsume() {
        registerShutdownHook();
        try {
            this.assign(Collections.singletonList(new TopicPartition(getTopicName(), getEventType().ordinal())));
            while (true) {
                ConsumerRecords<K, V> records = this.poll(1000);
                int noMessageFound = 0;
                if (records.count() == 0) {
                    noMessageFound++;
                    if (noMessageFound > MAX_NO_MESSAGE_FOUND_COUNT) {
                        break;
                    }
                    continue;
                }
                for (ConsumerRecord<K, V> record : records) {
                    log.info("partition = {}, offset = {}, key = {}, value = {}\n",
                            record.partition(), record.offset(), record.key(), record.value());
                    resolveAction(record);
                    commitSync();
                }
            }
        } catch (WakeupException e) {
            // ignore for shutdown
        } finally {
            this.close();
            log.info("Closing consumer {}", getClass().getCanonicalName());
        }
    }
}

