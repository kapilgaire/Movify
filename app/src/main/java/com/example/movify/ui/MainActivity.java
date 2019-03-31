package com.example.movify.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.movify.R;
import com.example.movify.adapters.MovieAdapter;
import com.example.movify.model.MovieResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainViewInterface {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.movie_rv)
    RecyclerView movieRv;

    MovieAdapter mMovieAdapter;

    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        setupViews();
        mMainPresenter = new MainPresenter(this);
        mMainPresenter.getMovies();

    }

    private void setupViews() {
        movieRv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showToast(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();

    }

    @Override
    public void displayMovies(MovieResponse movieResponse) {
        if (movieResponse != null) {

            mMovieAdapter = new MovieAdapter(movieResponse.getMovieData().getMovieList(), MainActivity.this);
            movieRv.setAdapter(mMovieAdapter);
        } else {
        }
    }

    @Override
    public void displayError(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
