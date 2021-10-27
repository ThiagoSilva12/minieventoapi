package br.com.thiagosilva.minieventoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagosilva.minieventoapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
