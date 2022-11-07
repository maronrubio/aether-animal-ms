package xyz.budsoftstudio.aetheranimalms.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.service.AnimalService;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private static final Logger logger = getLogger(AnimalController.class);

    @Autowired
    AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<AnimalDTO>> getAllAnimals(){
        return new ResponseEntity<>(animalService.getAllAnimals(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalDTO> getAnimal(@PathVariable("id") Long id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AnimalDTO> addAnimal(@RequestBody AnimalDTO animal){
        AnimalDTO result;
        logger.info("Add Animal Request: {}", animal);
        result = animalService.addAnimal(animal);
        logger.info("Add Animal Response: {}", result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AnimalDTO> deleteAnimal(@PathVariable("id") Long id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnimalDTO> editAnimal(@PathVariable("id") Long id, AnimalDTO animalDTO){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
