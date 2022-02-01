package com.krishnasaladi.webflux.documents;

import com.krishnasaladi.webflux.models.InsertUserRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class User {

    public User(InsertUserRequest insertUserRequest) {
        this.name = insertUserRequest.getName();
        this.email = insertUserRequest.getEmail();
    }


    @Id
    private String id;

    private String name;

    private String email;

}
