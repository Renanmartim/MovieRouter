package com.MovieStore.MovieStore.ServerRouter;
import com.MovieStore.MovieStore.Handler.StoreHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class StoreRouter {

    @Bean
    public RouterFunction<ServerResponse> getAll(StoreHandler storeHandler) {

        return route()
                .POST("/v1/add", storeHandler::addMovie)
                .GET("/v1/get", request -> storeHandler.getAll())
                .build();
    }
}
