package com.lhamacorp.cashtrackerinvest.service;

import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TIpoInvestimentoRepository;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoInvestimentoService {

    private TIpoInvestimentoRepository repository;

    @Autowired
    public TipoInvestimentoService(TIpoInvestimentoRepository repository) {
        this.repository = repository;
    }

    public List<TipoInvestimento> getAll() {
        return repository.findAll();
    }

    public TipoInvestimento save(TipoInvestimento tipoInvestimento) {
        return repository.save(tipoInvestimento);
    }

    public TipoInvestimento update(TipoInvestimento tipoInvestimento) {
        return repository.save(tipoInvestimento);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

}
