package com.example.movify.ui;

import com.example.movify.model.MovieResponse;

public interface MainViewInterface {

    void showToast(String s);
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);
}
