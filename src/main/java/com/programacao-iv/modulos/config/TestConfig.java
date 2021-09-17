package com.programacao-iv.modulos.config;

import com.programacao-iv.modulos.pessoaFisica.model.PessoaFisica;
import com.programacao-iv.modulos.pessoaFisica.repositorio.PessoaFisicaRepositorio;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private PessoaFisicaRepositorio pessoaFisicaRepositorio;

  @Override
  public void run(String... args) throws Exception {
    PessoaFisica pessoaFisica1 = new PessoaFisica(
      null,
      "José Ramos",
      "joseramos@gmail.com",
      "932.830.370-27"
    );
    PessoaFisica pessoaFisica2 = new PessoaFisica(
      null,
      "João Freitas",
      "joaofreitas@gmail.com",
      "848.102.930-09"
    );

    pessoaFisicaRepositorio.saveAll(
      Arrays.asList(pessoaFisica1, pessoaFisica2)
    );
  }
}
