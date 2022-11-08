package xyz.budsoftstudio.aetheranimalms.util;

import xyz.budsoftstudio.aetheranimalms.dto.AnimalDTO;
import xyz.budsoftstudio.aetheranimalms.dto.BreedDTO;
import xyz.budsoftstudio.aetheranimalms.entity.AnimalEntity;
import xyz.budsoftstudio.aetheranimalms.entity.BreedPercentageEntity;

import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalMapper {

    public AnimalDTO mapToDTO(AnimalEntity entity){
        List<BreedDTO> breedDTOList = new ArrayList<>();
        for(BreedPercentageEntity breedPercentageEntity : entity.getBreed()){
            BreedDTO breedPercentageDTO = new BreedDTO();
            breedPercentageDTO.setPercentage(breedPercentageEntity.getPercentage());
            breedPercentageDTO.setName(breedPercentageEntity.getBreed().getName());
            breedDTOList.add(breedPercentageDTO);
        }

        return AnimalDTO.builder()
                .id(entity.getId())
                .age(Period.between(entity.getBirthDate().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate(), new Date().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()).getMonths())
                .birthDate(entity.getBirthDate())
                .weight(entity.getWeight())
                .breeds(breedDTOList)
                .wingBandNo(entity.getWingBandNo())
                .build();
    }

    public AnimalEntity mapToEntity(AnimalDTO dto){
        return AnimalEntity.builder()
                .wingBandNo(dto.getWingBandNo())
                .birthDate(dto.getBirthDate())
                .weight(dto.getWeight())
                .build();
    }
}
