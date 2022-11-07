package xyz.budsoftstudio.aetheranimalms.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.budsoftstudio.aetheranimalms.dao.BreedDAO;
import xyz.budsoftstudio.aetheranimalms.entity.BreedEntity;
import xyz.budsoftstudio.aetheranimalms.repository.BreedRepository;

@Service
public class BreedDAOImpl implements BreedDAO {
    @Autowired
    BreedRepository breedRepository;

    @Override
    public BreedEntity getBreed(String breed) {
        return breedRepository.findByName(breed);
    }
}
