package com.example.movify.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.movify.R;
import com.example.movify.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MoviesHolder> {

    private List<Movie> movieList;
    private Context context;

    public MovieAdapter(List<Movie> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @Override
    public MoviesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_movies, parent, false);
        MoviesHolder mh = new MoviesHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(MoviesHolder holder, int position) {

        holder.movieDescTvMovieLayout.setText(movieList.get(position).getSummary());
        holder.movieNameTvMovieLayout.setText(movieList.get(position).getTitle_long());

        Picasso.get().load(movieList.get(position).getLarge_cover_image()).into(holder.movieCoverArtIvMovieLayout);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MoviesHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.movie_cover_art_iv_movie_layout)
        ImageView movieCoverArtIvMovieLayout;
        @BindView(R.id.movie_name_tv_movie_layout)
        TextView movieNameTvMovieLayout;
        @BindView(R.id.movie_desc_tv_movie_layout)
        TextView movieDescTvMovieLayout;

        public MoviesHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);


        }
    }
}
