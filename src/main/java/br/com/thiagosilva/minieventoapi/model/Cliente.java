package br.com.thiagosilva.minieventoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
@Column(length = 100 , nullable = false)
	private String nomeCliente;

@Column(length = 200, nullable = false, unique = true)
	private String emailCliente;

@Column(length = 20)
	private String telefoneCliente;



public Cliente() {
}

public Cliente(Long idCliente, String nomeCliente, String emailCliente, String telefoneCliente) {
	this.idCliente = idCliente;
	this.nomeCliente = nomeCliente;
	this.emailCliente = emailCliente;
	this.telefoneCliente = telefoneCliente;
}

public Long getIdCliente() {
	return idCliente;
}

public void setIdCliente(Long idCliente) {
	this.idCliente = idCliente;
}

public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public String getEmailCliente() {
	return emailCliente;
}

public void setEmailCliente(String emailCliente) {
	this.emailCliente = emailCliente;
}

public String getTelefoneCliente() {
	return telefoneCliente;
}

public void setTelefoneCliente(String telefoneCliente) {
	this.telefoneCliente = telefoneCliente;
}


}