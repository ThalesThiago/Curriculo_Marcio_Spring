package com.example.demo.Service;
import com.example.demo.Model.Bootcamp;
import com.example.demo.Repository.BootcampRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class BootcampService{

    @Autowired
    private BootcampRepository bootcampRepository;

    public List<Bootcamp> getAllBootcamp() {
        return bootcampRepository.findAll();
    }

    public Optional<Bootcamp> getBootcampById(Long id) {
        return bootcampRepository.findById(id);
    }

    @Transactional
    public Bootcamp criarBootcamp(Bootcamp bootcamp) {
        return bootcampRepository.save(bootcamp);
    }

    @Transactional
    public Bootcamp atualizarBootcamp(Long id, Bootcamp bootcampDetalhes) throws Exception {
        Optional<Bootcamp> bootcamp = bootcampRepository.findById(id);

        if (bootcamp.isPresent()) {
            Bootcamp bootcamp1 = bootcamp.get();

           bootcamp1.setNome(bootcampDetalhes.getNome());
           bootcamp1.setInstituicao(bootcampDetalhes.getInstituicao());
           bootcamp1.setAno(bootcampDetalhes.getAno());

            return bootcampRepository.save(bootcamp1);
        }
        else {
            throw new Exception("Bootcamp não encontrado com o id: " + id);
        }
    }
    @Transactional
    public void deletarBootcamp(@PathVariable Long id) {
        Optional<Bootcamp> optionalBootcamp = bootcampRepository.findById(id);

        if (optionalBootcamp.isPresent()) {
            Bootcamp bootcamp = optionalBootcamp.get();
            bootcampRepository.delete(bootcamp);

        }
    }

}