package xyz.budsoftstudio.aetheranimalms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.budsoftstudio.aetheranimalms.dao.AnimalDAO;
import xyz.budsoftstudio.aetheranimalms.dao.BreedDAO;
import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.dto.BreedDTO;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;
import xyz.budsoftstudio.aetheranimalms.entity.BreedEntity;
import xyz.budsoftstudio.aetheranimalms.entity.BreedPercentageEntity;
import xyz.budsoftstudio.aetheranimalms.service.AnimalService;
import xyz.budsoftstudio.aetheranimalms.util.AnimalMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalDAO animalDAO;

    @Autowired
    BreedDAO breedDAO;

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
        //Validate Request Object
        //Check if breed exists then use existing

        //set breed percent

        AnimalEntity animalEntity = animalMapper.mapToEntity(animalDTO);

        List<BreedPercentageEntity> breedPercentageEntityList = new ArrayList<>();
        for(BreedDTO breedDTO : animalDTO.getBreeds()){
            BreedPercentageEntity breedPercentageEntity = new BreedPercentageEntity();
            BreedEntity breedEntity;
            breedEntity = checkIfBreedExists(breedDTO.getName());
            breedPercentageEntity.setBreed(breedEntity);
            breedPercentageEntity.setAnimal(animalEntity);
            breedPercentageEntity.setPercentage(breedDTO.getPercentage());
            breedPercentageEntityList.add(breedPercentageEntity);
        }
        animalEntity.setBreed(breedPercentageEntityList);

        animalDAO.saveAnimal(animalEntity);
        AnimalDTO result = animalMapper.mapToDTO(animalEntity);
        return result;
    }

    private BreedEntity checkIfBreedExists(String breed){
        return breedDAO.getBreed(breed);
    }
}
