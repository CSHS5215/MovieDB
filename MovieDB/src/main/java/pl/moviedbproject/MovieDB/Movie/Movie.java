package pl.moviedbproject.MovieDB.Movie;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import java.time.LocalDate;

public class Movie {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;

    private final String name;
    private final String authorName;
    private int rating;
    private final LocalDate date;
    private final Category category;

    public Movie(Long id, String name, String authorName, int rating, LocalDate date, Category category) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;

        this.setRating(rating);
        this.date = date;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating > 0 && rating <= 10) {
            this.rating = rating;
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }
}
