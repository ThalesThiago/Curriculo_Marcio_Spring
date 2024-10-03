package com.example.demo.Service;
import com.example.demo.Model.Experiencia;
import com.example.demo.Repository.ExperienciaRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public List<Experiencia> getAllExperiencia() {
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> getExperienciaById(Long id) {
        return experienciaRepository.findById(id);
    }

    @Transactional
    public Experiencia criarExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Transactional
    public Experiencia atualizarExperiencia(Long id, Experiencia experienciaDetalhes) throws EntityNotFoundException {
        Optional<Experiencia> experienciaOptional = experienciaRepository.findById(id);

        if (experienciaOptional.isPresent()) {
            Experiencia experiencia = experienciaOptional.get();
            experiencia.setCargo(experienciaDetalhes.getCargo());
            experiencia.setEmpresa(experienciaDetalhes.getEmpresa());
            experiencia.setPeriodo(experienciaDetalhes.getPeriodo());
            experiencia.setResponsabilidades(experienciaDetalhes.getResponsabilidades());

            return experienciaRepository.save(experiencia);
        } else {
            throw new EntityNotFoundException("Experiência não encontrada com o id: " + id);
        }
    }

    @Transactional
    public void deletarExperiencia(Long id) throws EntityNotFoundException {
        Optional<Experiencia> experienciaOptional = experienciaRepository.findById(id);

        if (experienciaOptional.isPresent()) {
            Experiencia experiencia = experienciaOptional.get();
            experienciaRepository.delete(experiencia);
        } else {
            throw new EntityNotFoundException("Experiência não encontrada com o id: " + id);
        }
    }
}
