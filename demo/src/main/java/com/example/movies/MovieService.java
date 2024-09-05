package com.example.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired    //telling framework to instantiate the movierep variable
    private MovieRepository movieRepository; //we need instance of a class to use the class
    //inside service class write database access methods
    public List<Movie> allMovies(){
    return movieRepository.findAll();
    //findAll() method is pre-defined in movieRepository as it extends MongoRepository interface
    }
//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
