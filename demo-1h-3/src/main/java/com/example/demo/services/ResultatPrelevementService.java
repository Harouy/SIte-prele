package com.example.demo.services;

import com.example.demo.entities.ResultatPrelevement;

import java.util.List;

public interface ResultatPrelevementService {

    void saveResultatPrelevement(ResultatPrelevement resultatPrelevement);
    ResultatPrelevement getResultatPrelevement(Long id);
    void deleteResultatPrelevement(long id);
    List<ResultatPrelevement> getAllResultatPrelevement();
}
