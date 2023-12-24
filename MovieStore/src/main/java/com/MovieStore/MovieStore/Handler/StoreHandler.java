package com.MovieStore.MovieStore.Handler;

import com.MovieStore.MovieStore.Entity.StoreEntity;
import com.MovieStore.MovieStore.Repository.StoreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class StoreHandler {

    private StoreRepository storeRepository;

    public StoreHandler(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public Mono<ServerResponse> addMovie(ServerRequest serverRequest){

        return serverRequest.bodyToMono(StoreEntity.class)
                .flatMap(storeRepository::save)
                .then(ServerResponse.status(HttpStatus.CREATED).build());

    }

    public Mono<ServerResponse> getAll() {

        Flux<StoreEntity> allMovies = storeRepository.findAll();

        return ServerResponse.ok().body(allMovies, StoreEntity.class);
    }
}
