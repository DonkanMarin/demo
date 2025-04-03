package com.example.demo.repository;

import com.example.demo.model.LibroModel;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.List;

@Repository

public class LibroRepositorio {
    private List<LibroModel>listaLibros = new ArrayList<>();
    @PostConstruct
    public void init(){
        listaLibros.add(new LibroModel(2,"98998989","Spring in action","Addison_Wesley",2018,"a"));

    }

}
