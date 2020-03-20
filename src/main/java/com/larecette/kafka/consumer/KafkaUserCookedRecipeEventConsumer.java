package com.larecette.kafka.consumer;

import com.larecette.kafka.EventType;
import com.larecette.kafka.KafkaUserCookedRecipeEvent;
import com.larecette.kafka.UserCookedRecipeKafka;
import com.larecette.mapper.UserRecipeCookedElasticMapper;
import com.larecette.repo.UserCookedRecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Properties;

@Slf4j
public class KafkaUserCookedRecipeEventConsumer extends BaseKafkaConsumer<String, KafkaUserCookedRecipeEvent> {
    private final static String TOPIC_NAME = "user-cooked-recipe";

    @Autowired
    private UserRecipeCookedElasticMapper elasticMapper;

    @Autowired
    private UserCookedRecipeRepository recipeRepository;

    public KafkaUserCookedRecipeEventConsumer(Properties properties, EventType eventType) {
        super(properties, eventType);
    }

    @Override
    protected String getTopicName() {
        return TOPIC_NAME;
    }

    @Override
    protected void resolveAction(ConsumerRecord<String, KafkaUserCookedRecipeEvent> consumerRecord) {
        final UserCookedRecipeKafka userCookedRecipeKafka = consumerRecord.value().getUserCookedRecipeKafka();

        switch (getEventType()) {
            case CREATE: {
                log.error("CREATE {}", userCookedRecipeKafka.toString());
                recipeRepository.save(elasticMapper.map(userCookedRecipeKafka));
                break;
            }
            case DELETE: {
                log.error("DELETE {}",  userCookedRecipeKafka.toString());
                recipeRepository.delete(elasticMapper.map(userCookedRecipeKafka ));
                break;
            }
            case UPDATE: {
                log.error("UPDATE {}", userCookedRecipeKafka.toString());
                recipeRepository.save(elasticMapper.map(userCookedRecipeKafka ));
                break;
            }
        }
    }
}
