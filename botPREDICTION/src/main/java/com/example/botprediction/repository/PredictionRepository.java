package com.example.botprediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.botprediction.entities.Prediction;

public interface PredictionRepository extends JpaRepository<Prediction, Long> {
    // Puoi aggiungere qui metodi query personalizzati se necessario
}
