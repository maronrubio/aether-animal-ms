package xyz.budsoftstudio.aetheranimalms.service;

import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;

import java.util.List;

public interface AnimalService {

    List<AnimalDTO> getAllAnimals();

    AnimalDTO getAnimal(Long id);

    AnimalDTO addAnimal(AnimalDTO animalDTO);
}
