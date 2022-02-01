package com.krishnasaladi.webflux.controllers;

import com.krishnasaladi.webflux.documents.User;
import com.krishnasaladi.webflux.models.InsertUserRequest;
import com.krishnasaladi.webflux.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webflux/user")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @PostMapping("/insert")
    public Mono<ResponseEntity<?>> insertUser(@RequestBody Mono<InsertUserRequest> insertUserRequestMono) {
        return insertUserRequestMono.flatMap(insertUserRequest -> userRepository.insert(new User(insertUserRequest)))
            .flatMap(user -> Mono.just(new ResponseEntity<>(user, HttpStatus.CREATED)));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<?>> findUserById(@PathVariable String id) {
        return userRepository.findById(id).flatMap(user -> Mono.just(new ResponseEntity<>(user, HttpStatus.OK)));
    }

}
