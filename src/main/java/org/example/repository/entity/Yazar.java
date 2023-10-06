package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_yazar")
public class Yazar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ad;
    @Column(nullable = false)
    private String soyad;
    private LocalDate dogumTarihi;
    private LocalDate olumTarihi;
    private String ulke;
    private String biyografi;
    @ElementCollection
    private List<String> yazarKitaplari;
    @Embedded
    private BaseEntity baseEntity;
}
