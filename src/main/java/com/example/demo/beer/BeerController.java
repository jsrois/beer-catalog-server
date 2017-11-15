package com.example.demo.beer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// TODO add complete data: name, description, type, origin, price

@RestController

public class BeerController {

    private BeerRepository repository;

    public BeerController(BeerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/other")
    Collection<Beer> list() {
        return repository.findAll();
    }

    @GetMapping("/good-beers")
    Collection<Map<String,String>> goodBeers() {
        return repository.findAll().stream()
                .filter(this::isGreat)
                .map(b -> {
                    Map<String, String> m = new HashMap<>();
                    m.put("id", b.getId().toString());
                    m.put("name", b.getName());
                    m.put("description", b.getDescription());
                    m.put("type", b.getType());
                    m.put("price", b.getPrice());
                    m.put("origin", b.getOrigin());
                    m.put("imageId", b.getImageId());
                    return m;
                }).collect(Collectors.toList());
    }

    private boolean isGreat(Beer beer) {
        return beer.getName().equals("Estrella Galicia");
    }

}
