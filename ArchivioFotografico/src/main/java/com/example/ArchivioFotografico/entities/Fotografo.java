package com.example.ArchivioFotografico.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "fotografi")
@Data // Genera automaticamente getter, setter, equals, hashCode e toString
@NoArgsConstructor // Genera un costruttore vuoto
@AllArgsConstructor // Genera un costruttore con tutti i campi
public class Fotografo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String fotoPath;
    
    @Column(nullable = false, length = 1000)
    private String biografia;
    
    // Altre proprietà e relazioni con altre entità

    // Getter, setter, metodi aggiuntivi

}
