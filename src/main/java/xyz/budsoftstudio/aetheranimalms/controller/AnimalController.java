package xyz.budsoftstudio.aetheranimalms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    public ResponseEntity<List<AnimalDTO>> getAllAnimals(){
        return new ResponseEntity<>(animalService.getAllAnimals(), HttpStatus.OK);
    }
}
