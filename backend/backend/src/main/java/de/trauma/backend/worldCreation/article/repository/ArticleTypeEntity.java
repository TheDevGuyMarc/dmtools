package de.trauma.backend.worldCreation.article.repository;

import de.trauma.backend.worldCreation.article.domain.ArticleType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ArticleTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "types")
    private List<ArticleEntity> articles;

    public ArticleTypeEntity() {
    }

    public ArticleTypeEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ArticleTypeEntity(ArticleType articleType) {
        this.id = articleType.getId();
        this.name = articleType.getName();
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

    public List<ArticleEntity> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleEntity> articles) {
        this.articles = articles;
    }
}
