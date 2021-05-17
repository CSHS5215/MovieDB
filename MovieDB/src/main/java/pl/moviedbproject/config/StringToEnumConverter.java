package pl.moviedbproject.config;

import org.springframework.core.convert.converter.Converter;
import pl.moviedbproject.api.Category;

public class StringToEnumConverter implements Converter<String, Category> {
    @Override
    public Category convert(String source) {
        return Category.valueOf(source.toUpperCase());
    }
}