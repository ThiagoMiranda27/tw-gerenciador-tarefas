package br.com.ibm.twgerenciadortarefas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ibm.twgerenciadortarefas.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}
