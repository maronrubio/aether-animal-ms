package xyz.budsoftstudio.aetheranimalms.util;

import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;
import xyz.budsoftstudio.aetheranimalms.entity.BreedEntity;

import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class AnimalMapper {

    public AnimalDTO mapToDTO(AnimalEntity entity){
        return AnimalDTO.builder()
                .id(entity.getId())
                .age(Period.between(entity.getBirthDate().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate(), new Date().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()).getYears())
                .birthDate(entity.getBirthDate())
                .weight(entity.getWeight())
                .breed(entity.getBreed().getName())
                .wingBandNo(entity.getWingBandNo())
                .build();
    }

    public AnimalEntity mapToEntity(AnimalDTO dto){
        return AnimalEntity.builder()
                .wingBandNo(dto.getWingBandNo())
                .birthDate(dto.getBirthDate())
                .weight(dto.getWeight())
                .breed(BreedEntity.builder().name(dto.getBreed()).build())
                .build();
    }
}
