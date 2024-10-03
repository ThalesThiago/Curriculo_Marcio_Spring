package com.example.demo.Service;
import com.example.demo.Model.Educacao;
import com.example.demo.Repository.EducacaoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducacaoService {

    @Autowired
    private EducacaoRepository educacaoRepository;

    public List<Educacao> getAllEducacao() {
        return educacaoRepository.findAll();
    }

    public Optional<Educacao> getEducacaoById(Long id) {
        return educacaoRepository.findById(id);
    }

    @Transactional
    public Educacao criarEducacao(Educacao educacao) {
        return educacaoRepository.save(educacao);
    }

    @Transactional
    public Educacao atualizarEducacao(Long id, Educacao educacaoDetalhes) throws EntityNotFoundException {
        Optional<Educacao> educacaoOptional = educacaoRepository.findById(id);

        if (educacaoOptional.isPresent()) {
            Educacao educacao = educacaoOptional.get();
            educacao.setNivel(educacaoDetalhes.getNivel());
            educacao.setCurso(educacaoDetalhes.getCurso());
            educacao.setInstituicao(educacaoDetalhes.getInstituicao());
            educacao.setAnoConclusao(educacaoDetalhes.getAnoConclusao());

            return educacaoRepository.save(educacao);
        } else {
            throw new EntityNotFoundException("Educação não encontrada com o id: " + id);
        }
    }

    @Transactional
    public void deletarEducacao(Long id) throws EntityNotFoundException {
        Optional<Educacao> educacaoOptional = educacaoRepository.findById(id);

        if (educacaoOptional.isPresent()) {
            Educacao educacao = educacaoOptional.get();
            educacaoRepository.delete(educacao);
        } else {
            throw new EntityNotFoundException("Educação não encontrada com o id: " + id);
        }
    }
}

