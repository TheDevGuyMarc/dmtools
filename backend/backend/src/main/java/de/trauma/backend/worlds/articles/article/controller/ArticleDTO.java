package de.trauma.backend.worlds.articles.article.controller;

import de.trauma.backend.worlds.articles.article.domain.Article;
import de.trauma.backend.worlds.articles.articletype.domain.ArticleType;
import de.trauma.backend.worlds.articles.category.domain.Category;
import de.trauma.backend.worlds.world.domain.World;

import java.util.List;

public class ArticleDTO {
    private final Long id;
    private final String title;
    private final String pronunciation;
    private final String content;
    private final String image;
    private final World world;
    private final ArticleType type;
    private final List<Category> categories;

    public ArticleDTO(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.pronunciation = article.getPronunciation();
        this.content = article.getContent();
        this.image = article.getImage();
        this.world = article.getWorld();
        this.type = article.getType();
        this.categories = article.getCategories();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }

    public World getWorld() {
        return world;
    }

    public ArticleType getType() {
        return type;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
