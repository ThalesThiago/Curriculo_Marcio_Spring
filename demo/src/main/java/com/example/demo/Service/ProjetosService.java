package com.example.demo.Service;

import com.example.demo.Model.Projetos;
import com.example.demo.Repository.ProjetoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetosService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projetos> getAllProjeto() {
        return projetoRepository.findAll();
    }

    public Optional<Projetos> getProjetoById(Long id) {
        return projetoRepository.findById(id);
    }

    @Transactional
    public Projetos criarProjeto(Projetos projeto) {
        return projetoRepository.save(projeto);
    }

    @Transactional
    public Projetos atualizarProjeto(Long id, Projetos projetoDetalhes) throws EntityNotFoundException {
        Optional<Projetos> projetoOptional = projetoRepository.findById(id);

        if (projetoOptional.isPresent()) {
            Projetos projeto = projetoOptional.get();
            projeto.setNome(projetoDetalhes.getNome());
            projeto.setDescricao(projetoDetalhes.getDescricao());
            projeto.setTecnologias(projetoDetalhes.getTecnologias());
            projeto.setAno(projetoDetalhes.getAno());

            return projetoRepository.save(projeto);
        } else {
            throw new EntityNotFoundException("Projeto não encontrado com o id: " + id);
        }
    }

    @Transactional
    public void deletarProjeto(Long id) throws EntityNotFoundException {
        Optional<Projetos> projetoOptional = projetoRepository.findById(id);

        if (projetoOptional.isPresent()) {
            Projetos projeto = projetoOptional.get();
            projetoRepository.delete(projeto);
        } else {
            throw new EntityNotFoundException("Projeto não encontrado com o id: " + id);
        }
    }
}
