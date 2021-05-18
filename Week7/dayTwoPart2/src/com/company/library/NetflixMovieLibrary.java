package com.company.library;

import com.company.entity.NetflixMovie;

import java.util.List;

public class NetflixMovieLibrary {

    private final List<NetflixMovie> movies;

    public NetflixMovieLibrary(List<NetflixMovie> movies) {
        this.movies = movies;
    }

    public List<NetflixMovie> getTotalNetflixMoviesInNetflixLibrary(){
        return movies;
    }
}
