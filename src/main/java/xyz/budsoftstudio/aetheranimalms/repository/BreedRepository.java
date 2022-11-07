package xyz.budsoftstudio.aetheranimalms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import xyz.budsoftstudio.aetheranimalms.entity.BreedEntity;

@Repository
public interface BreedRepository extends JpaRepository<BreedEntity, Long> {
    @Query("SELECT b FROM breed b WHERE b.name = ?1")
    BreedEntity findByName(String name);
}
