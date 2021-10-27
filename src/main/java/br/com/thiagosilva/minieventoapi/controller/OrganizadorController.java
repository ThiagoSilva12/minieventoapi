package br.com.thiagosilva.minieventoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiagosilva.minieventoapi.model.Organizador;
import br.com.thiagosilva.minieventoapi.repository.OrganizadorRepository;

@RestController
@RequestMapping("/organizador")
public class OrganizadorController {

	
	@Autowired
	private OrganizadorRepository or;
	
	@GetMapping("/listar")
	public List<Organizador>Listar(){
		return or.findAll();
	}
	
	@GetMapping("/pesquisar/{id}")
	public Optional<Organizador> organizadorId(@PathVariable Long id){
		return or.findById(id);
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Organizador organizador) {
		or.save(organizador);
		return "Organizador cadastrado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody Organizador organizador,@PathVariable Long id) {
		Optional<Organizador> org=or.findById(id);
		
		if(!org.isPresent()) {
			return "O organizador não foi localizado";
		}
		
		organizador.setIdOrganizador(id);
		or.save(organizador);
		return "Organizador atualizado com sucesso";
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		or.deleteById(id);
		return "Organizador apagado";
	}
	
	
}
