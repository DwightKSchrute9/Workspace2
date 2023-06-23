package com.example.ArchivioFotografico.controller;





import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ArchivioFotografico.entities.Fotografia;
import com.example.ArchivioFotografico.entities.Fotografo;
import com.example.ArchivioFotografico.repository.FotografiaRepository;
import com.example.ArchivioFotografico.service.FotografoService;

import java.util.List;

@RestController
@RequestMapping("/fotografi")
public class FotografoController {

    private final FotografoService fotografoService;
    private final FotografiaRepository fotografiaRepository;

    
    public FotografoController(FotografoService fotografoService, FotografiaRepository fotografiaRepository) {
        this.fotografoService = fotografoService;
        this.fotografiaRepository = fotografiaRepository;
    }

    @GetMapping
    public ResponseEntity<List<Fotografo>> ricercaFotografi(@RequestParam("ricerca") String ricerca) {
        List<Fotografo> fotografi = fotografoService.cercaFotografiPerNome(ricerca);
        return ResponseEntity.ok(fotografi);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fotografo> dettagliFotografo(@PathVariable("id") Long id) {
        Fotografo fotografo = fotografoService.getFotografoById(id);
        if (fotografo != null) {
            return ResponseEntity.ok(fotografo);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/{id}/fotografie")
    public ResponseEntity<List<Fotografia>> getFotografieByFotografoId(@PathVariable("id") Long id) {
        List<Fotografia> fotografie = fotografiaRepository.findByFotografoId(id);
        return ResponseEntity.ok(fotografie);
    }
}
