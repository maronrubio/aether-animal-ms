package xyz.budsoftstudio.aetheranimalms.dto;

import lombok.*;
import xyz.budsoftstudio.aetheranimalms.entity.BreedEntity;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AnimalDTO {
    private Long id;
    private String wingBandNo;
    private String breed;
    private Date birthDate;
    private Integer age;
    private Double weight;
}
