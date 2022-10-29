package xyz.budsoftstudio.aetheranimalms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
}
