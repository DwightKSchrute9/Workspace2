package com.example.standAloneFestival.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.standAloneFestival.entities.Merchandise;

public interface MerchandiseRepository extends JpaRepository<Merchandise, Long> {
    // Personalizza le query, se necessario
}