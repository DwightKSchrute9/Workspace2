package com.example.botprediction.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGptRequest {
    private String team1Name;
    private String team2Name;
    private int team1Wins;
    private int team2Wins;
}