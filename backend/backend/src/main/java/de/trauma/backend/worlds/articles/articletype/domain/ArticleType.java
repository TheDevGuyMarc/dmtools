package de.trauma.backend.worlds.articles.articletype.domain;

import de.trauma.backend.worlds.articles.articletype.repository.ArticleTypeEntity;

public class ArticleType {
    private Long id;
    private String name;

    public ArticleType(ArticleTypeEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
