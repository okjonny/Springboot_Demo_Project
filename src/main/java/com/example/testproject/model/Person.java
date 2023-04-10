package com.example.testproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;
@Getter
@Setter
public class Person implements Serializable {
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }

}
