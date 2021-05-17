package pl.moviedbproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.moviedbproject.dao.entity.Movie;

@Repository
public interface MovieDBRepo extends CrudRepository<Movie, Long> {
}
