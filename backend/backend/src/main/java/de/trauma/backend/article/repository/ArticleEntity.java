package de.trauma.backend.article.repository;

import de.trauma.backend.article.domain.Article;
import de.trauma.backend.world.repository.WorldEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String pronunciation;

    @Column
    private String content;

    @Column
    private String image;

    @ManyToOne
    @JoinColumn(name = "world_id")
    private WorldEntity world;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private ArticleTypeEntity type;

    @ManyToMany
    @JoinTable(
            name = "article_category",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<CategoryEntity> categories;

    public ArticleEntity() {
    }

    public ArticleEntity(Long id, String title, String pronunciation, String content, String image, WorldEntity world, ArticleTypeEntity type) {
        this.id = id;
        this.title = title;
        this.pronunciation = pronunciation;
        this.content = content;
        this.image = image;
        this.world = world;
        this.type = type;
    }

    public ArticleEntity(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.pronunciation = article.getPronunciation();
        this.content = article.getContent();
        this.image = article.getImage();
        this.world = new WorldEntity(article.getWorld());
        this.type = new ArticleTypeEntity(article.getType());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public WorldEntity getWorld() {
        return world;
    }

    public void setWorld(WorldEntity world) {
        this.world = world;
    }

    public ArticleTypeEntity getType() {
        return type;
    }

    public void setType(ArticleTypeEntity type) {
        this.type = type;
    }

    public List<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
    }
}
