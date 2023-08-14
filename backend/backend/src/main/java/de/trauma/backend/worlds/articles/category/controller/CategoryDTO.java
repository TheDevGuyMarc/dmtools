package de.trauma.backend.worlds.articles.category.controller;

import de.trauma.backend.worlds.articles.category.domain.Category;

public class CategoryDTO {
    private final Long id;
    private final String name;

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
