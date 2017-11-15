package com.example.demo.beer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Beer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String type;
    private String price;
    private String origin;
    private String imageId;


    public Beer() {}

    public Beer(String name, String description, String type, String price, String origin, String imageId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.origin = origin;
        this.imageId = imageId;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }

    public String getImageId() {
        return imageId;
    }
}

