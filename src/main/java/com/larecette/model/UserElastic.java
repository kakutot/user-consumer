package com.larecette.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "users", type = "user")
public class UserElastic {
    @NotNull
    @Id
    UUID userId;

    @NotNull
    Integer activity = 1;

    @NotNull
    List<String> blacklist = new ArrayList();

    @NotNull
    @NotBlank
    String gender;

    @NotNull
    Double height;

    @NotNull
    Double weight;

    @NotNull
    Boolean includeCooked;
}
