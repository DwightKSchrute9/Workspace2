package com.example.standAloneFestival.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.standAloneFestival.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Personalizza le query, se necessario
}