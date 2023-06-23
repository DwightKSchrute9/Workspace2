package com.example.ArchivioFotografico.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.ArchivioFotografico.entities.Fotografia;

public interface FotografiaRepository extends JpaRepository<Fotografia, Long> {
    List<Fotografia> findByFotografoId(Long fotografoId);
}
