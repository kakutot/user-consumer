package com.larecette.config;

import com.larecette.kafka.consumer.KafkaUserCookedRecipeEventConsumer;
import com.larecette.kafka.EventType;
import com.larecette.kafka.consumer.KafkaUserEventConsumer;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

@Configuration
public class KafkaConsumerConfig {

    @Value("${kafka.broker.host}")
    private String brokerHost;

    @Value("${kafka.broker.port}")
    private int brokerPort;

    @Value("${kafka.schemaRegistry.host}")
    private String schemaRegistryHost;

    @Value("${kafka.schemaRegistry.port}")
    private int schemaRegistryPort;

    private Properties getBaseConsumerProps() {
        final Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerHost + ":" + brokerPort);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "default");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryHost + ":" + schemaRegistryPort);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);

        return props;
    }

    @Bean
    @Qualifier("createUserConsumer")
    public KafkaUserEventConsumer createUserConsumer () {
        return new KafkaUserEventConsumer(getBaseConsumerProps(), EventType.CREATE);
    }

    @Bean
    @Qualifier("deleteUserConsumer")
    public KafkaUserEventConsumer deleteUserConsumer () {
        return new KafkaUserEventConsumer(getBaseConsumerProps(), EventType.DELETE);
    }

    @Bean
    @Qualifier("updateUserConsumer")
    public KafkaUserEventConsumer updateUserConsumer () {
        return new KafkaUserEventConsumer(getBaseConsumerProps(), EventType.UPDATE);
    }

    @Bean
    @Qualifier("createUserCookedRecipeConsumer")
    public KafkaUserCookedRecipeEventConsumer createUserCookedEventConsumer () {
        return new KafkaUserCookedRecipeEventConsumer(getBaseConsumerProps(), EventType.CREATE);
    }

    @Bean
    @Qualifier("deleteUserCookedRecipeConsumer")
    public KafkaUserCookedRecipeEventConsumer deleteUserCookedEventConsumer () {
        return new KafkaUserCookedRecipeEventConsumer(getBaseConsumerProps(), EventType.DELETE);
    }

}
