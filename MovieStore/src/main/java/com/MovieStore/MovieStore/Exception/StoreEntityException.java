package com.MovieStore.MovieStore.Exception;

public class StoreEntityException extends RuntimeException{
    private String mensage;
    public StoreEntityException(String s){
        super(s);
        this.mensage = s;
    }
}
