package com.projetootavio.ProjetoSpringBootOtavio.Repository;

import com.projetootavio.ProjetoSpringBootOtavio.model.JornadaTabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTabalho, Long> {
}