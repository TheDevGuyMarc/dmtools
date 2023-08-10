package de.trauma.backend.article.repository;

import de.trauma.backend.world.repository.WorldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleTypeRepository extends JpaRepository<ArticleTypeEntity, Long> {
    Optional<ArticleTypeEntity> findById(Long id);
    Optional<ArticleTypeEntity> findByName(String name);
}
