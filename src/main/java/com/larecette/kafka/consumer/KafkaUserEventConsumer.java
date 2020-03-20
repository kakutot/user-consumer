package com.larecette.kafka.consumer;

import com.larecette.kafka.EventType;
import com.larecette.kafka.KafkaUserEvent;
import com.larecette.kafka.UserKafka;
import com.larecette.mapper.UserElasticMapper;
import com.larecette.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Properties;

@Slf4j
public class KafkaUserEventConsumer extends BaseKafkaConsumer<String, KafkaUserEvent> {
    private final static String TOPIC_NAME = "usersinfo";

    @Autowired
    private UserElasticMapper elasticMapper;

    @Autowired
    private UserRepository recipeRepository;

    public KafkaUserEventConsumer(Properties properties, EventType eventType) {
        super(properties, eventType);
    }

    @Override
    public String getTopicName() {
        return TOPIC_NAME;
    }

    @Override
    public void resolveAction(ConsumerRecord<String, KafkaUserEvent> consumerRecord) {
        final UserKafka userKafka = consumerRecord.value().getUserKafka();

        switch (getEventType()) {
            case CREATE: {
                log.error("CREATE {}", userKafka.toString());
                recipeRepository.save(elasticMapper.map(userKafka));
                break;
            }
            case DELETE: {
                log.error("DELETE {}", userKafka.toString());
                recipeRepository.delete(elasticMapper.map(userKafka));
                break;
            }
            case UPDATE: {
                log.error("UPDATE {}", userKafka.toString());
                recipeRepository.save(elasticMapper.map(userKafka));
                break;
            }
        }
    }

}
