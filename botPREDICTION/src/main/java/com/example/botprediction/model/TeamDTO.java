package com.example.botprediction.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamDTO {
    private Long id;
    private String name;
    private String country;
    private String coach;
    private String stadium;

    // Costruttori, getter e setter generati automaticamente da Lombok
}