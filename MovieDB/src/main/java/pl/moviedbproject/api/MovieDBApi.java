package pl.moviedbproject.api;

import org.springframework.web.bind.annotation.*;
import pl.moviedbproject.dao.entity.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RequestMapping("/api/movies")
@RestController
public class MovieDBApi {

    private List<Movie> listOfMovies;


    public MovieDBApi() {
        listOfMovies = new ArrayList<>();
        listOfMovies.add(new Movie(1L, "INTERSTELLAR", "Cristopher Nolan", 10, LocalDate.of(2014, 10, 26), Category.SCI_FI));
        listOfMovies.add(new Movie(2L, "Collateral Beauty", "David Frankel", 9, LocalDate.of(2014, 12, 14), Category.DRAMA));
        listOfMovies.add(new Movie(3L, "Long xiong hu di", "Jackie Chan", 6, LocalDate.of(1986, 8, 16), Category.COMEDY));
    }

    @GetMapping("/all")
    public List<Movie> getAll() {
        return listOfMovies;
    }

    @GetMapping("/findByCategory")
    public Movie getByCategory(@RequestParam("category") Category category) {
        Optional<Movie> moviesByCategories = listOfMovies.stream()
                .filter(movie -> movie.getCategory() == category).findAny();
        return moviesByCategories.orElse(null);

    }

    @GetMapping("/findById")
    public Movie getById(@RequestParam("id") Long id) {
        Optional<Movie> moviesById = listOfMovies.stream()
                .filter(movie -> movie.getId() == id).findFirst();
        return moviesById.orElse(null);

    }

    @PostMapping
    public boolean addMovie(@RequestBody Movie movie){
        return listOfMovies.add(movie);
    }

    @PutMapping
    public boolean updateMovie(@RequestBody Movie movie){
        return listOfMovies.add(movie);
    }

    @DeleteMapping
    public boolean deleteMovie (@RequestParam("id") Long id) {
        return listOfMovies.removeIf(movie -> movie.getId() == id);
    }




}
