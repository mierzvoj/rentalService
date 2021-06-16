package com.example.reantalservice1.model;

public class Movie {

    private Long id;
    private String movieTitle;
    private boolean isAvaliable;
    private EnumCat movieCategory;

    public Movie(Long id, String movieTitle, boolean isAvaliable, EnumCat movieCategory) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.isAvaliable = isAvaliable;
        this.movieCategory = movieCategory;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    public EnumCat getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(EnumCat movieCategory) {
        this.movieCategory = movieCategory;
    }
}
