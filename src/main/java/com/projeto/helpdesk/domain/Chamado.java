package com.projeto.helpdesk.domain;

import java.time.LocalDate;

import com.projeto.helpdesk.domain.enums.Prioridade;
import com.projeto.helpdesk.domain.enums.Status;

public class Chamado {
	
	private Integer id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observacaoes;
	
}
