package com.example.ArchivioFotografico.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "fotografie")
@Data // Genera automaticamente getter, setter, equals, hashCode e toString
@NoArgsConstructor // Genera un costruttore vuoto
@AllArgsConstructor // Genera un costruttore con tutti i campi
public class Fotografia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fotografo_id", nullable = false)
    private Fotografo fotografo;

    @Column(nullable = false)
    private String nome;

    // Altre proprietà e relazioni con altre entità

    // Getter, setter, metodi aggiuntivi

}
