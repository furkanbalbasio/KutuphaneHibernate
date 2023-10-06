package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_kullanici")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ad;
    @Column(nullable = false)
    private String soyad;
    @Column(nullable = false,unique = true,length = 11)
    private String tcKimlik;
    @Column(nullable = false,unique = true)
    private String telefonNo;
    @Column(nullable = false)
    private Double paraMiktari;
//    @ElementCollection
//    @Builder.Default
//    private List<String> satinAlinanKitaplar=new ArrayList<>();
    @Embedded
    BaseEntity baseEntity;
}
