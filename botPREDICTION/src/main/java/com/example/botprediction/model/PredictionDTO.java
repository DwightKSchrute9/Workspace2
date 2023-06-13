package com.example.botprediction.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PredictionDTO {
    private Long id;
    private String homeTeam;
    private String awayTeam;
    private int headToHeadWinsHome;
    private int headToHeadWinsAway;
    private int totalMatches;
    private int homeTeamWins;
    private int awayTeamWins;
    private String predictionText;

    // Costruttori, getter e setter generati automaticamente da Lombok
}
