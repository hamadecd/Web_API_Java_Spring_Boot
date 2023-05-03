package br.com.criandoapi.projeto.service;

import br.com.criandoapi.projeto.entity.Usuario;
import br.com.criandoapi.projeto.repository.IUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private IUsuario repository;

    public UsuarioService(IUsuario repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario() {
        return repository.findAll();
    }

    public Usuario criarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario editarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public Boolean excluirUsuario(Integer id) {
        repository.deleteById(id);
        return true;
    }
}
