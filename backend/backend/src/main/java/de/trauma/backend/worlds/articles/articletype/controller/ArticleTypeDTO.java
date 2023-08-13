package de.trauma.backend.worlds.articles.articletype.controller;

import de.trauma.backend.worlds.articles.articletype.domain.ArticleType;

public class ArticleTypeDTO {
    private final Long id;
    private final String name;

    public ArticleTypeDTO(ArticleType articleType) {
        this.id = articleType.getId();
        this.name = articleType.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
