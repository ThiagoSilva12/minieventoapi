package br.com.thiagosilva.minieventoapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;

@Column(nullable = false)
	private String nomeAgenda;

@Column
	private String idOrganizador;

@Column(nullable = false)
	private Date dataEvento;

@Column(nullable = false)
	private String horaEvento;

@Column(nullable = false)
	private String ingresso;





public Agenda() {
}

public Agenda(Long idAgenda, String nomeAgenda, String idOrganizador, Date dataEvento, String horaEvento,
		String ingresso) {
	this.idAgenda = idAgenda;
	this.nomeAgenda = nomeAgenda;
	this.idOrganizador = idOrganizador;
	this.dataEvento = dataEvento;
	this.horaEvento = horaEvento;
	this.ingresso = ingresso;
}

public Long getIdAgenda() {
	return idAgenda;
}

public void setIdAgenda(Long idAgenda) {
	this.idAgenda = idAgenda;
}

public String getNomeAgenda() {
	return nomeAgenda;
}

public void setNomeAgenda(String nomeAgenda) {
	this.nomeAgenda = nomeAgenda;
}

public String getIdOrganizador() {
	return idOrganizador;
}

public void setIdOrganizador(String idOrganizador) {
	this.idOrganizador = idOrganizador;
}

public Date getDataEvento() {
	return dataEvento;
}

public void setDataEvento(Date dataEvento) {
	this.dataEvento = dataEvento;
}

public String getHoraEvento() {
	return horaEvento;
}

public void setHoraEvento(String horaEvento) {
	this.horaEvento = horaEvento;
}

public String getIngresso() {
	return ingresso;
}

public void setIngresso(String ingresso) {
	this.ingresso = ingresso;

}





}
