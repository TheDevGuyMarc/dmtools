package de.trauma.backend.campaigns.encounters.obstacle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ObstacleRepository extends JpaRepository<ObstacleEntity, Long> {
    Optional<ObstacleEntity> findById(Long id);
}
