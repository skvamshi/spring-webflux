package com.krishnasaladi.webflux.repositories;

import com.krishnasaladi.webflux.documents.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends ReactiveMongoRepository<User, String> {

}
