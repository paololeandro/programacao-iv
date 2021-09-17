package com.programacao-iv.modulos.pessoaFisica.servicos;

import com.programacao-iv.modulos.pessoaFisica.model.PessoaFisica;
import java.util.List;

public interface PessoaFisicaServicos {
  List<PessoaFisica> buscarTodos();
  PessoaFisica buscarPorId(Long id);
  PessoaFisica inserir(PessoaFisica pessoaFisica);
}
