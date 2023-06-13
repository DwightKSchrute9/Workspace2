package com.example.botprediction.repository;

import org.apache.catalina.connector.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Long> {
    // Eventuali metodi di query personalizzati possono essere definiti qui
}
