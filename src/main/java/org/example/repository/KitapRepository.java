package org.example.repository;

import org.example.repository.entity.Kitap;
import org.example.utility.MyFactoryRepository;

import java.util.Optional;

public class KitapRepository extends MyFactoryRepository<Kitap,Long> {
    public KitapRepository() {
        super(new Kitap());
    }

    public Optional<Kitap> kitapSatinAl(Long id) {

    }
}
