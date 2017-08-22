package com.lhamacorp.cashtrackerinvest.service;

import com.lhamacorp.cashtrackerinvest.entity.investimento.Investimento;
import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestimentoService {

    private InvestimentoRepository repository;

    @Autowired
    public InvestimentoService(InvestimentoRepository repository) {
        this.repository = repository;
    }

    public List<Investimento> getAll() {
        return repository.findAll();
    }

    public Investimento save(Investimento investimento) {
        return repository.save(investimento);
    }

    public Investimento update(Investimento investimento) {
        return repository.save(investimento);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
