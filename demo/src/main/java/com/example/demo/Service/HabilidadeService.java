package com.example.demo.Service;

import com.example.demo.Model.Habilidade;
import com.example.demo.Repository.HabilidadeRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HabilidadeService {

    @Autowired
    private HabilidadeRepository habilidadeRepository;

    public List<Habilidade> getAllHabilidade() {
        return habilidadeRepository.findAll();
    }

    public Optional<Habilidade> getHabilidadeById(Long id) {
        return habilidadeRepository.findById(id);
    }

    @Transactional
    public Habilidade criarHabilidade(Habilidade habilidade) {
        return habilidadeRepository.save(habilidade);
    }

    @Transactional
    public Habilidade atualizarHabilidade(Long id, Habilidade habilidadeDetalhes) throws EntityNotFoundException {
        Optional<Habilidade> habilidadeOptional = habilidadeRepository.findById(id);

        if (habilidadeOptional.isPresent()) {
            Habilidade habilidade = habilidadeOptional.get();
            habilidade.setDescricao(habilidadeDetalhes.getDescricao());

            return habilidadeRepository.save(habilidade);
        } else {
            throw new EntityNotFoundException("Habilidade não encontrada com o id: " + id);
        }
    }

    @Transactional
    public void deletarHabilidade(Long id) throws EntityNotFoundException {
        Optional<Habilidade> habilidadeOptional = habilidadeRepository.findById(id);

        if (habilidadeOptional.isPresent()) {
            Habilidade habilidade = habilidadeOptional.get();
            habilidadeRepository.delete(habilidade);
        } else {
            throw new EntityNotFoundException("Habilidade não encontrada com o id: " + id);
        }
    }
}
