package com.larecette.mapper;

import com.larecette.kafka.UserCookedRecipeKafka;
import com.larecette.model.UserCookedRecipeElastic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.TemporalAccessor;
import java.util.UUID;

@Service
@Slf4j
public class UserRecipeCookedElasticMapper implements ElasticMapper<UserCookedRecipeKafka, UserCookedRecipeElastic> {
    @Override
    public UserCookedRecipeElastic map(UserCookedRecipeKafka userCookedRecipeKafka) {
        log.error(userCookedRecipeKafka.getCreatedAt());
        UserCookedRecipeElastic userCookedRecipeElastic = new UserCookedRecipeElastic();
        userCookedRecipeElastic.setId(UUID.randomUUID());
        userCookedRecipeElastic.setUserId(userCookedRecipeKafka.getUserId());
        userCookedRecipeElastic.setRecipeId(userCookedRecipeKafka.getRecipeId());
        userCookedRecipeElastic.setCreatedAt(Instant.parse(userCookedRecipeKafka.getCreatedAt()));

        return userCookedRecipeElastic;
    }

    @Override
    public UserCookedRecipeKafka mapBack(UserCookedRecipeElastic userCookedRecipeElastic) {
        UserCookedRecipeKafka userCookedRecipeKafka = new UserCookedRecipeKafka();
        userCookedRecipeKafka.setUserId(userCookedRecipeElastic.getUserId());
        userCookedRecipeKafka.setRecipeId(userCookedRecipeElastic.getRecipeId());
        userCookedRecipeKafka.setCreatedAt(userCookedRecipeElastic.getCreatedAt().toString());

        return userCookedRecipeKafka;
    }
}
