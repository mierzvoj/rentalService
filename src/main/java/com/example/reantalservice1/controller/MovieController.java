package com.example.reantalservice1.controller;

import com.example.reantalservice1.model.Movie;
import com.example.reantalservice1.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/micro")
public class MovieController {
    private final RentalService rentalService;

    public MovieController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return new ResponseEntity<Movie>(rentalService.getMovie(id), HttpStatus.OK);
    }

    @PutMapping("/return/{id}")
    public void changeAval(@PathVariable Long id) {
        rentalService.returnMovie(id);
    }

}
