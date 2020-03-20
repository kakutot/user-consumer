package com.larecette.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "users-extra", type = "user-cooked-recipe")
public class UserCookedRecipeElastic {
    @Id
    UUID id;

    @NotNull
    String userId;

    @NotNull
    @NotBlank
    String recipeId;

    @NotNull
    Instant createdAt;
}
