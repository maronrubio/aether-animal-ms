package xyz.budsoftstudio.aetheranimalms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name="breed")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreedEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "breed")
    private List<BreedPercentageEntity> breedPercentage;
}
