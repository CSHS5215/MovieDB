package pl.moviedbproject.dao.entity;

import pl.moviedbproject.api.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private String name;
    private String authorName;
    private int rating;
    private LocalDate date;
    private Category category;

    public Movie() {
    }

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
