package com.MovieStore.MovieStore.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StoreEntity {
    private String id;
    private String name;
    private String resume;

    private Long price;

    public StoreEntity(String name, String resume, Long price) {
        this.name = name;
        this.resume = resume;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
