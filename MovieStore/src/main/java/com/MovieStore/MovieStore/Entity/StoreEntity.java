package com.MovieStore.MovieStore.Entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StoreEntity {

    @Id
    private String id;

    @NotBlank(message = "This not be blank!")
    @Size(min = 3, message = "Name must have at least 3 characters")
    private String name;

    @NotBlank
    @Size(min = 5, message = "Resume must have at least 5 characters")
    private String resume;

    @NotBlank(message = "This not be blank!")
    @Min(value = 1, message = "Price must be greater than or equal to 1")
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
