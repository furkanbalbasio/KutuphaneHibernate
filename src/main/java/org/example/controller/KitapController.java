package org.example.controller;

import org.example.repository.entity.Kitap;
import org.example.service.KitapService;

import java.util.List;
import java.util.Optional;

public class KitapController {
    KitapService kitapService;
    public KitapController(){
        this.kitapService=new KitapService();
    }

    public Kitap save(Kitap entity){
        return kitapService.save(entity);
    }

    public void update(Kitap entity){
        kitapService.update(entity);
    }
    public List<Kitap> findAll(){
        return kitapService.findAll();
    }
    public Optional<Kitap> findById(Long id){
        return kitapService.findById(id);
    }
    public List<Kitap> saveAll(List<Kitap> kitapList){
        return (List<Kitap>) kitapService.saveAll(kitapList);
    }
    public void delete(Kitap kitap){
        kitapService.delete(kitap);
    }

    public void deleteById(Long id){
        kitapService.deleteById(id);
    }

    public boolean existById(Long id){
        return kitapService.existById(id);
    }
    public List<Kitap> findByEntity(Kitap kitap){
        return kitapService.findByEntity(kitap);
    }

    public List<Kitap> findByColumnNameAndValue(String columnName, String columnValue) {
        return kitapService.findByColumnNameAndValue(columnName, columnValue);
    }
    public Optional<Kitap> kitapSatinAl(Long id){
        return kitapService.kitapSatinAl(id);
    }
}
