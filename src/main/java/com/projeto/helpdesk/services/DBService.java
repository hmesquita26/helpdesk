package com.projeto.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.helpdesk.domain.Chamado;
import com.projeto.helpdesk.domain.Cliente;
import com.projeto.helpdesk.domain.Tecnico;
import com.projeto.helpdesk.domain.enums.Perfil;
import com.projeto.helpdesk.domain.enums.Prioridade;
import com.projeto.helpdesk.domain.enums.Status;
import com.projeto.helpdesk.repositories.ChamadoRepository;
import com.projeto.helpdesk.repositories.ClienteRepository;
import com.projeto.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tecnicoTeste1 = new Tecnico(null, "Heytor Felipe", "23116489262", "heytor@mail.com", "12345");
		tecnicoTeste1.addPerfil(Perfil.ADMIN);
		
		Cliente clienteTeste1 = new Cliente(null, "Tio Bill", "73146530899", "bill@mail.com", "12345");
		
		Chamado chamadoTeste1 = new Chamado(null, null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tecnicoTeste1, clienteTeste1);
		
		tecnicoRepository.saveAll(Arrays.asList(tecnicoTeste1));
		clienteRepository.saveAll(Arrays.asList(clienteTeste1));
		chamadoRepository.saveAll(Arrays.asList(chamadoTeste1));
		
	}

}
