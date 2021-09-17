package com.programacao-iv.modulos.pessoaFisica.repositorio;

import com.programacao-iv.modulos.pessoaFisica.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepositorio
  extends JpaRepository<PessoaFisica, Long> {}
