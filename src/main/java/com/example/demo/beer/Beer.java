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
    private String prize;
    private String origin;


    public Beer() {}

    public Beer(String name, String description, String type, String prize, String origin) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.prize = prize;
        this.origin = origin;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + "'" +
                "}";
    }


    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getPrize() {
        return prize;
    }

    public String getOrigin() {
        return origin;
    }
}

