package com.dio.Live.repository;

import com.dio.Live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository  extends JpaRepository<JornadaTrabalho,Long> {
}
