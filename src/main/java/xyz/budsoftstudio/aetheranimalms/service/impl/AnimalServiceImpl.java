package xyz.budsoftstudio.aetheranimalms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.budsoftstudio.aetheranimalms.dao.AnimalDAO;
import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;
import xyz.budsoftstudio.aetheranimalms.service.AnimalService;
import xyz.budsoftstudio.aetheranimalms.util.AnimalMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalDAO animalDAO;

    AnimalMapper animalMapper = new AnimalMapper();

    @Override
    public List<AnimalDTO> getAllAnimals() {
        List<AnimalDTO> animalDTOList = new ArrayList<>();
        for(AnimalEntity entity : animalDAO.getAll()){
            animalDTOList.add(animalMapper.mapToDTO(entity));
        }
        return animalDTOList;
    }

    @Override
    public AnimalDTO getAnimal(Long id){
        return null;
    }

    @Override
    public AnimalDTO addAnimal(AnimalDTO animalDTO){
        AnimalEntity animalEntity = animalMapper.mapToEntity(animalDTO);
        animalDAO.saveAnimal(animalEntity);
        AnimalDTO result = animalMapper.mapToDTO(animalEntity);
        return result;
    }
}
