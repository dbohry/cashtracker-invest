package com.lhamacorp.cashtrackerinvest.service;

import com.lhamacorp.cashtrackerinvest.entity.registro.Registro;
import com.lhamacorp.cashtrackerinvest.entity.registro.RegistroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    private RegistroRepository repository;

    public List<Registro> getAll() {
        return repository.findAll();
    }

    public Registro save(Registro registro) {
        return repository.save(registro);
    }

    public Registro update(Registro registro) {
        return repository.save(registro);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

}
