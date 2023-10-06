package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.repository.enums.Etur;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ad;
    @Column(nullable = false)
    private Long yazarId;
    @Column(nullable = false)
    private String yazarAdi;
    @Enumerated
    private Etur tur;
    @Column(nullable = false)
    private Integer sayfaSayisi;
    private String yayinEvi;
    @Builder.Default
    private LocalDate yayinTarihi= LocalDate.now();
    @Column(unique = true)
    private String isbn;
    @Builder.Default
    private Integer adet=0;
    @Builder.Default
    private Double fiyat=0.0;
    @Builder.Default
    private boolean satistaMi=false;
    @Embedded
    BaseEntity baseEntity;
}
