package xyz.budsoftstudio.aetheranimalms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.budsoftstudio.aetheranimalms.dao.AnimalDAO;
import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.service.AnimalService;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalDAO animalDAO;

    @Override
    public List<AnimalDTO> getAllAnimals() {
        return null;
    }
}
