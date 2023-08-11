package de.trauma.backend.campaignCreation.sessionCreation.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<SessionEntity, Long> {
}
