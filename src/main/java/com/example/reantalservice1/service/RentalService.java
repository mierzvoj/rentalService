package com.example.reantalservice1.service;

import com.example.reantalservice1.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id) {
        ResponseEntity<Movie> forentity1 = restTemplate.getForEntity("http://localhost:8080/movies/" + id, Movie.class);
        Movie forentity = forentity1.getBody();
        return forentity;
    }

    public void returnMovie(Long id) {
        String movieResourceUrl = ("http://localhost:8080/movies/aval/" + id);
        restTemplate.put(movieResourceUrl, null);
    }


}
