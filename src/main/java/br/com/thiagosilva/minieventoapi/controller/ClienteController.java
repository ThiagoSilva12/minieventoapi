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

import br.com.thiagosilva.minieventoapi.model.Cliente;
import br.com.thiagosilva.minieventoapi.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return cr.findAll();
	}
	@GetMapping("/pesquisar/{id}")
	public Optional<Cliente> pesquisarId(@PathVariable Long id) {
		return cr.findById(id);
	}
	@PostMapping("/cadastro")
	public String cadastro (@RequestBody Cliente cliente) {
		cr.save(cliente);
	return "Cliente cadastrado com sucesso";
	}
	
	@PutMapping("atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Cliente cliente) {
		Optional<Cliente> cli =cr.findById(id);
		if(!cli.isPresent()) {
			return "Cliente naão localizado";
		}
		cliente.setIdCliente(id);
		cr.save(cliente);
		return "Dados do cliente atualizados";
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		cr.deleteById(id);
		return "Cliente apagado";
	}
	
	
	
	
}
