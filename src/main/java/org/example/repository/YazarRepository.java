package org.example.repository;

import org.example.repository.entity.Yazar;
import org.example.utility.MyFactoryRepository;

public class YazarRepository extends MyFactoryRepository<Yazar,Long> {
    public YazarRepository() {
        super(new Yazar());
    }
}
