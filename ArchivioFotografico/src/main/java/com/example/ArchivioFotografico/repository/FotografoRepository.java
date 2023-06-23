package com.example.ArchivioFotografico.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ArchivioFotografico.entities.Fotografo;

public interface FotografoRepository extends JpaRepository<Fotografo, Long> {
    List<Fotografo> findByNomeContainingIgnoreCase(String nome);
}
