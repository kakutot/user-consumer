package com.larecette.repo;

import com.larecette.model.UserCookedRecipeElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserCookedRecipeRepository extends ElasticsearchRepository<UserCookedRecipeElastic, String> {
}
