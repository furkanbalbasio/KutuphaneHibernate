package org.example.controller;

import org.example.repository.entity.Kullanici;
import org.example.service.KullaniciService;

import java.util.List;
import java.util.Optional;

public class KullaniciController {
    KullaniciService kullaniciService;
    public KullaniciController(){
        this.kullaniciService=new KullaniciService();
    }

    public Kullanici save(Kullanici entity){
        return kullaniciService.save(entity);
    }

    public void update(Kullanici entity){
        kullaniciService.update(entity);
    }
    public List<Kullanici> findAll(){
        return kullaniciService.findAll();
    }
    public Optional<Kullanici> findById(Long id){
        return kullaniciService.findById(id);
    }
    public List<Kullanici> saveAll(List<Kullanici> kullaniciList){
        return (List<Kullanici>) kullaniciService.saveAll(kullaniciList);
    }
    public void delete(Kullanici kullanici){
        kullaniciService.delete(kullanici);
    }

    public void deleteById(Long id){
        kullaniciService.deleteById(id);
    }

    public boolean existById(Long id){
        return kullaniciService.existById(id);
    }
    public List<Kullanici> findByEntity(Kullanici kullanici){
        return kullaniciService.findByEntity(kullanici);
    }

    public List<Kullanici> findByColumnNameAndValue(String columnName, String columnValue) {
        return kullaniciService.findByColumnNameAndValue(columnName, columnValue);
    }
    public Optional<Kullanici> kimlikDogrulama(String kimlikNo){
        return kullaniciService.kimlikDogrulama(kimlikNo);
    }
}
