package com.larecette.repo;

import com.larecette.model.UserElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<UserElastic, String> {
}