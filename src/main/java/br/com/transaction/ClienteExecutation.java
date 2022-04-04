package br.com.transaction;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteExecutation {
	
	@Autowired
	ClienteRespository clienteRespository;
	
	@Autowired
	ClienteRespository2 clienteRespository2;
	
	@Bean
	@Transactional
	public void executar() {
		
		regravarCliente();
		atualizarStatus();
		
	}
	

	public void atualizarStatus() {
		
		List<Cliente> lista = clienteRespository.findAll();
		
		int a = 1;
		
		for(Cliente c : lista) {
			
			if(a < 11) {
				c.setAtivo("F");
				clienteRespository.save(c);
			}else {
				c.setAtivo("F");
				clienteRespository.save(c);
			}
			
			a++;
		}

	}
	
	
	public void regravarCliente() {
		
		List<Cliente> lista = clienteRespository.findAll();
		
		for(Cliente c : lista) {
			Cliente2 c2 = new Cliente2();
			c2.setAtivo(c.getAtivo());
			c2.setId(c.getId());
			c2.setNome(c.getNome());
			clienteRespository2.save(c2);
		}

	}
	
	
}
