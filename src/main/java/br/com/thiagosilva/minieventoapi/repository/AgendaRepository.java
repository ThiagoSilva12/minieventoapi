package br.com.thiagosilva.minieventoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagosilva.minieventoapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

	
}
