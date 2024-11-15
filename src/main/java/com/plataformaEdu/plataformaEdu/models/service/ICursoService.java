package com.plataformaEdu.plataformaEdu.models.service;

import com.plataformaEdu.plataformaEdu.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface ICursoService {

    List<Curso> findAll();

    Optional<Curso> findById(Long id);

    Curso save(Curso curso);

    void delete(Long id);
}