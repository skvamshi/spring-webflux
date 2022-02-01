//package com.krishnasaladi.webflux.config;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.reactivestreams.client.MongoClient;
//import com.mongodb.reactivestreams.client.MongoClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
//import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
//
//@Configuration
//@EnableReactiveMongoRepositories("com.krishnasaladi.webflux.repositories")
//public class MongoReactiveConfig extends AbstractReactiveMongoConfiguration {
//
////    @Bean
////    public MongoClient mongoClient() {
////        ConnectionString connectionString = new ConnectionString("mongodb://root:w7zoBtkQoacs@23.88.127.214:27017/?authSource=admin");
////        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
////            .applyConnectionString(connectionString)
////            .build();
////
////        return MongoClients.create(mongoClientSettings);
////    }
//
//    @Override
//    protected String getDatabaseName() {
//        return System.getenv("DB_NAME");
//    }
//
//}