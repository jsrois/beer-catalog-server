package com.example.demo.beer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class BeerCommandLineRunner implements CommandLineRunner{

    private final BeerRepository repository;

    public BeerCommandLineRunner(BeerRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Estrella Galicia", "Estrella Damm",
                "Moritz", "Mahou")
                .forEach(name -> repository.save(new Beer(name))
                );
        repository.findAll().forEach(System.out::println);
    }
}
