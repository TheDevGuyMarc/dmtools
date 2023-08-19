package de.trauma.backend.characters.condition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConditionRepository extends JpaRepository<ConditionEntity, Long> {
    Optional<ConditionEntity> findById(Long id);
}
