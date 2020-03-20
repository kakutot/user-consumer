package com.larecette.mapper;

import com.larecette.kafka.UserKafka;
import com.larecette.model.UserElastic;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserElasticMapper implements ElasticMapper<UserKafka, UserElastic> {

    @Override
    public UserElastic map(UserKafka userKafka) {
        UserElastic userElastic = new UserElastic();
        userElastic.setUserId(UUID.fromString(userKafka.getUserId()));
        userElastic.setActivity(userKafka.getActivity());
        userElastic.setBlacklist(userKafka.getBlacklist());
        userElastic.setGender(userKafka.getGender());
        userElastic.setHeight(userKafka.getHeight());
        userElastic.setIncludeCooked(userKafka.getIncludeCooked());
        userElastic.setWeight(userKafka.getWeight());
        userElastic.setHeight(userKafka.getHeight());

        return userElastic;
    }

    @Override
    public UserKafka mapBack(UserElastic userElastic) {
        UserKafka userKafka = new UserKafka();
        userKafka.setUserId(userElastic.getUserId().toString());
        userKafka.setActivity(userElastic.getActivity());
        userKafka.setBlacklist(userElastic.getBlacklist());
        userKafka.setGender(userElastic.getGender());
        userKafka.setHeight(userElastic.getHeight());
        userKafka.setIncludeCooked(userElastic.getIncludeCooked());
        userKafka.setWeight(userElastic.getWeight());
        userKafka.setHeight(userElastic.getHeight());

        return userKafka;
    }
}
