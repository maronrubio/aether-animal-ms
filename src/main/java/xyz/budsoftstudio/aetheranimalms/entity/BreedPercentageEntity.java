package xyz.budsoftstudio.aetheranimalms.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name="breed_percentage")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BreedPercentageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer percentage;

    @ManyToOne
    @JoinColumn(name = "breed_id")
    private BreedEntity breed;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private AnimalEntity animal;
}
