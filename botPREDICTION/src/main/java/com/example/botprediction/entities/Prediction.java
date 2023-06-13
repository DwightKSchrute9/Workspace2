package com.example.botprediction.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "predictions")
@Data
@NoArgsConstructor
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team1_id")
    private Team squadra1;

    @ManyToOne
    @JoinColumn(name = "team2_id")
    private Team squadra2;

    private int vittorieSquadra1;

    private int vittorieSquadra2;

    // Altri campi e getter/setter

    // Costruttore
    public Prediction(Team squadra1, Team squadra2, int vittorieSquadra1, int vittorieSquadra2) {
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
        this.vittorieSquadra1 = vittorieSquadra1;
        this.vittorieSquadra2 = vittorieSquadra2;
    }

	public void setPredictionText(String predictionText) {
		// TODO Auto-generated method stub
		
	}
}