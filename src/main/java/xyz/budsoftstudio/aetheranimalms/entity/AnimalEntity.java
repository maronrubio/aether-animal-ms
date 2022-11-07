package xyz.budsoftstudio.aetheranimalms.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

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

    @ManyToOne(cascade = CascadeType.ALL)
    private BreedEntity breed;

    private Double weight;

    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date birthDate;

}
