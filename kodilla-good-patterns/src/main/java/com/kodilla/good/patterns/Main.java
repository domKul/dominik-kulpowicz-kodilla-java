package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String joining = movieStore.getMovies().entrySet().stream()
                .flatMap(f -> f.getValue().stream())
                .collect(Collectors.joining("!"));


        System.out.println(joining);



    }
}
