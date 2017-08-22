package com.lhamacorp.cashtrackerinvest.entity.investimento;

import org.springframework.stereotype.Component;

@Component
public class InvestimentoConverter {

    public Investimento convert(InvestimentoDTO dto) {
        if (dto == null) return null;

        Investimento bo = new Investimento();

        bo.setId(dto.getId());
        bo.setNome(dto.getNome());
        bo.setTipoInvestimento(dto.getTipoInvestimento());

        return bo;
    }

    public InvestimentoDTO convert(Investimento bo) {
        if (bo == null) return null;

        InvestimentoDTO dto = new InvestimentoDTO();

        dto.setId(bo.getId());
        dto.setNome(bo.getNome());
        dto.setTipoInvestimento(bo.getTipoInvestimento());

        return dto;
    }

}
