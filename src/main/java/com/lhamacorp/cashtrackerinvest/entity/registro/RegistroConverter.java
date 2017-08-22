package com.lhamacorp.cashtrackerinvest.entity.registro;

import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistroConverter {

    private InvestimentoConverter investimentoConverter;

    @Autowired
    public RegistroConverter(InvestimentoConverter investimentoConverter) {
        this.investimentoConverter = investimentoConverter;
    }

    public Registro convert(RegistroDTO dto) {
        if (dto == null) return null;

        Registro bo = new Registro();

        bo.setId(dto.getId());
        bo.setData(dto.getData());
        bo.setInvestimento(investimentoConverter.convert(dto.getInvestimento()));
        bo.setValor(dto.getValor());

        return bo;
    }

    public RegistroDTO convert(Registro bo) {
        if (bo == null) return null;

        RegistroDTO dto = new RegistroDTO();

        dto.setId(bo.getId());
        dto.setData(bo.getData());
        dto.setInvestimento(investimentoConverter.convert(bo.getInvestimento()));
        dto.setValor(bo.getValor());

        return dto;
    }

}
