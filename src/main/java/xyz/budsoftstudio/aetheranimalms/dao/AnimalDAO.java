package xyz.budsoftstudio.aetheranimalms.dao;

import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;
import xyz.budsoftstudio.aetheranimalms.exception.AetherException;

import java.util.List;

public interface AnimalDAO {

    List<AnimalEntity> getAll();

    AnimalEntity getAnimal(Long id) throws AetherException;

    AnimalEntity saveAnimal(AnimalEntity entity);

    AnimalEntity deleteAnimal(AnimalEntity entity);
}
