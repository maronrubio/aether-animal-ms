package xyz.budsoftstudio.aetheranimalms.dao.impl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.budsoftstudio.aetheranimalms.dao.AnimalDAO;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;
import xyz.budsoftstudio.aetheranimalms.exception.AetherException;
import xyz.budsoftstudio.aetheranimalms.repository.AnimalRepository;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class AnimalDAOImpl implements AnimalDAO {

    private Logger logger = getLogger(AnimalDAOImpl.class);
    @Autowired
    AnimalRepository animalRepository;

    @Override
    public List<AnimalEntity> getAll() {
        List<AnimalEntity> result = animalRepository.findAll();
        logger.info("Get All Animal Result: {}", result);
        return result;
    }

    @Override
    public AnimalEntity getAnimal(Long id) throws AetherException {
        AnimalEntity result = animalRepository.findById(id).orElseThrow(()->new AetherException("Product Not Found"));
        logger.info("Get Animal Result: {}", result);
        return result;
    }

    @Override
    public AnimalEntity saveAnimal(AnimalEntity entity){
        AnimalEntity result = animalRepository.save(entity);
        logger.info("Save Animal Result: {}", result);
        return result;
    }

    @Override
    public AnimalEntity deleteAnimal(AnimalEntity entity){
        animalRepository.delete(entity);
        logger.info("Delete Animal Result: {}", entity);
        return entity;
    }
}
