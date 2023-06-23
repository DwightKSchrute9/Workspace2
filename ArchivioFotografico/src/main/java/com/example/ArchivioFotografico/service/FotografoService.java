package com.example.ArchivioFotografico.service;



import org.springframework.stereotype.Service;

import com.example.ArchivioFotografico.entities.Fotografo;
import com.example.ArchivioFotografico.repository.FotografoRepository;

import java.util.List;

@Service
public class FotografoService {

    private final FotografoRepository fotografoRepository;

    
    public FotografoService(FotografoRepository fotografoRepository) {
        this.fotografoRepository = fotografoRepository;
    }

    public List<Fotografo> cercaFotografiPerNome(String ricerca) {
        // Implementa la logica per cercare i fotografi per nome
        return fotografoRepository.findByNomeContainingIgnoreCase(ricerca);
    }

    public Fotografo getFotografoById(Long id) {
        // Implementa la logica per ottenere un fotografo per ID
        return fotografoRepository.findById(id).orElse(null);
    }
}
