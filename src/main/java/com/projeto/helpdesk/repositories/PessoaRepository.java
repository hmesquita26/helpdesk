package com.projeto.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
