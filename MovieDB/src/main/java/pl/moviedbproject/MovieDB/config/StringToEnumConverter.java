package pl.moviedbproject.MovieDB.config;

import org.springframework.core.convert.converter.Converter;
import pl.moviedbproject.MovieDB.Movie.Category;

public class StringToEnumConverter implements Converter<String, Category> {
    @Override
    public Category convert(String source) {
        return Category.valueOf(source.toUpperCase());
    }
}