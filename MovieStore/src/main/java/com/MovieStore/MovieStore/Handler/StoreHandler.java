package com.MovieStore.MovieStore.Handler;

import com.MovieStore.MovieStore.Entity.StoreEntity;
import com.MovieStore.MovieStore.Exception.StoreEntityException;
import com.MovieStore.MovieStore.Repository.StoreRepository;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Component
public class StoreHandler {

    private StoreRepository storeRepository;

    private Validator validator;

    public StoreHandler(StoreRepository storeRepository, Validator validator) {
        this.storeRepository = storeRepository;
        this.validator = validator;
    }

    public Mono<ServerResponse> addMovie(ServerRequest serverRequest){

        return serverRequest.bodyToMono(StoreEntity.class)
                .doOnNext(this::verifyValidator)
                .flatMap(storeRepository::save)
                .then(ServerResponse.status(HttpStatus.CREATED).build());

    }

    private void verifyValidator(StoreEntity storeEntity) {

        var constraintViolations = validator.validate(storeEntity);

        if (constraintViolations.size() > 0) {

            var errorMensage = constraintViolations
                    .stream()
                    .map(ConstraintViolation::getMessage)
                    .sorted()
                    .collect(Collectors.joining(","));
            throw new StoreEntityException(errorMensage);
        }

    }

    public Mono<ServerResponse> getAll() {

        Flux<StoreEntity> allMovies = storeRepository.findAll();

        return ServerResponse.ok().body(allMovies, StoreEntity.class);
    }
}
