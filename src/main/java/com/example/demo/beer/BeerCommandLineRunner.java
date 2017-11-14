package com.example.demo.beer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BeerCommandLineRunner implements CommandLineRunner{

    private final BeerRepository repository;

    public BeerCommandLineRunner(BeerRepository repository) {
        this.repository = repository;
    }


    @Override
    public void run(String... strings) throws Exception {
        List<Beer> list = new ArrayList<Beer>() {
            {
                add(new Beer("Estrella Galicia", "Probably the best beer in the world","cool","1.26","Galicia"));
                add(new Beer("Estrella Damm", "Not so good","cool","1.12","Spain (LOL)"));
                add(new Beer("Heineken", "Meh beer","some type here","1.32","Netherlands"));
            }
        };

        for (Beer beer: list) {
            repository.save(beer);
        }
    }
}
