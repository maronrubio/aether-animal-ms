package xyz.budsoftstudio.aetheranimalms.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class BreedDTO {
    private String name;
    private Integer percentage;
}
