package com.example.movify.network;

import com.example.movify.model.MovieResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetworkInterface {
    @GET("list_movies.json")
    Observable<MovieResponse> getMovieList(@Query("limit") int limit, @Query("page") int page  );
}
