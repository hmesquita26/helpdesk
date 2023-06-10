package com.projeto.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.helpdesk.domain.Pessoa;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	Optional<Pessoa> findByCpf(String cpf);
	Optional<Pessoa> findByEmail(String email);
}
