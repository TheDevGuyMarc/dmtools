package de.trauma.backend.worlds.articles.articletype.controller;

import de.trauma.backend.worlds.articles.articletype.domain.ArticleType;
import de.trauma.backend.worlds.articles.articletype.service.ArticleTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articletypes")
public class ArticleTypeController {
    private final ArticleTypeService articleTypeService;

    public ArticleTypeController(ArticleTypeService articleTypeService) {
        this.articleTypeService = articleTypeService;
    }

    @GetMapping
    public List<ArticleTypeDTO> list() {
        return this.articleTypeService.findAllArticleTypes()
                .stream()
                .map(ArticleTypeDTO::new)
                .toList();
    }

    @GetMapping("/{id}")
    public ArticleTypeDTO read(@PathVariable Long id) {
        return this.articleTypeService.findArticleTypeById(id)
                .map(ArticleTypeDTO::new)
                .orElseThrow();
    }

    @PostMapping
    public ArticleTypeDTO create(@RequestBody ArticleType articleType) {
        return new ArticleTypeDTO(this.articleTypeService.createArticleType(articleType));
    }

    @PutMapping("/{id}")
    public ArticleTypeDTO update(@PathVariable Long id, @RequestBody ArticleType articleType) throws ClassNotFoundException {
        return new ArticleTypeDTO(this.articleTypeService.updateArticleType(id, articleType));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.articleTypeService.deleteArticleType(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
