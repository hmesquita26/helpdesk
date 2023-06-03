package com.projeto.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
