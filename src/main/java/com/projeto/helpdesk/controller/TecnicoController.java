package com.projeto.helpdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.helpdesk.domain.Tecnico;
import com.projeto.helpdesk.domain.dtos.TecnicoDTO;
import com.projeto.helpdesk.services.TecnicoService;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoController {
	
	@Autowired
	private TecnicoService tecnicoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
		Tecnico tecnico = tecnicoService.findById(id);
		return ResponseEntity.ok().body(new TecnicoDTO(tecnico));
	}
}
