package xyz.budsoftstudio.aetheranimalms.dto;

import lombok.*;
import xyz.budsoftstudio.aetheranimalms.entity.BreedEntity;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AnimalDTO {
    private Long id;
    private String wingBandNo;
    private List<BreedDTO> breeds;
    private Date birthDate;
    private Integer age;
    private Double weight;
}
