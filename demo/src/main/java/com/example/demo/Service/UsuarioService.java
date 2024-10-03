package com.example.demo.Service;

import com.example.demo.Model.Usuario;
import com.example.demo.Repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }


    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }


    @Transactional
    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    @Transactional
    public Usuario atualizarUsuario(Long id, Usuario usuarioDetalhes) throws EntityNotFoundException {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            usuario.setNome(usuarioDetalhes.getNome());
            usuario.setEndereco(usuarioDetalhes.getEndereco());
            usuario.setTelefone(usuarioDetalhes.getTelefone());
            usuario.setLinkedin(usuarioDetalhes.getLinkedin());
            usuario.setInstagram(usuarioDetalhes.getInstagram());
            usuario.setGithub(usuarioDetalhes.getGithub());

            return usuarioRepository.save(usuario);
        } else {
            throw new EntityNotFoundException("Usuário não encontrado com o id: " + id);
        }
    }
    @Transactional
    public void deletarUsuario(Long id) throws EntityNotFoundException {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            usuarioRepository.delete(usuario);
        } else {
            throw new EntityNotFoundException("Usuário não encontrado com o id: " + id);
        }
    }
}
