package com.MovieStore.MovieStore.Repository;


import com.MovieStore.MovieStore.Entity.StoreEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.server.ServerResponse;

@Repository
public interface StoreRepository extends ReactiveMongoRepository<StoreEntity, String>, ServerResponse {
}
