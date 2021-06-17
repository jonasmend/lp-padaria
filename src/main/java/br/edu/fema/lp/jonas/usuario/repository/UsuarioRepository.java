package br.edu.fema.lp.jonas.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fema.lp.jonas.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
