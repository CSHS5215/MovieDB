package pl.moviedbproject.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.moviedbproject.dao.MovieDBRepo;
import pl.moviedbproject.dao.entity.Movie;

import java.util.Optional;

@Service
public class MovieDBManager {

    private final MovieDBRepo movieDBRepo;

    @Autowired
    public MovieDBManager(MovieDBRepo movieDBRepo) {
        this.movieDBRepo = movieDBRepo;
    }

    public Optional<Movie> find(Long id) {
        return movieDBRepo.findById(id);
    }

    public Iterable<Movie> findAll(Long id) {
        return movieDBRepo.findAll();
    }
}
