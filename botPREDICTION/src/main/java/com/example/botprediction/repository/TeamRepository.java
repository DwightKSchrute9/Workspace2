package com.example.botprediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.botprediction.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // Puoi aggiungere qui metodi query personalizzati se necessario
}