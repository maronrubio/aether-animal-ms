package xyz.budsoftstudio.aetheranimalms.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Entity(name="animal")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wingBandNo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animal")
    private List<BreedPercentageEntity> breed;

    private Double weight;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date birthDate;

}
