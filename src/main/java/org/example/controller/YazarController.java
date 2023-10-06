package org.example.controller;

import org.example.repository.entity.Yazar;
import org.example.service.YazarService;

import java.util.List;
import java.util.Optional;

public class YazarController {
    YazarService yazarService;
    public YazarController(){
        this.yazarService=new YazarService();
    }

    public Yazar save(Yazar entity){
        return yazarService.save(entity);
    }

    public void update(Yazar entity){
        yazarService.update(entity);
    }
    public List<Yazar> findAll(){
        return yazarService.findAll();
    }
    public Optional<Yazar> findById(Long id){
        return yazarService.findById(id);
    }
    public List<Yazar> saveAll(List<Yazar> yazarList){
        return (List<Yazar>) yazarService.saveAll(yazarList);
    }
    public void delete(Yazar yazar){
        yazarService.delete(yazar);
    }

    public void deleteById(Long id){
        yazarService.deleteById(id);
    }

    public boolean existById(Long id){
        return yazarService.existById(id);
    }
    public List<Yazar> findByEntity(Yazar yazar){
        return yazarService.findByEntity(yazar);
    }

    public List<Yazar> findByColumnNameAndValue(String columnName, String columnValue) {
        return yazarService.findByColumnNameAndValue(columnName, columnValue);
    }
}
