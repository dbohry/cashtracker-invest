package com.lhamacorp.cashtrackerinvest.entity.investimento;

import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimentoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvestimentoConverter {

    private TipoInvestimentoConverter tipoInvestimentoConverter;

    @Autowired
    public InvestimentoConverter(TipoInvestimentoConverter tipoInvestimentoConverter) {
        this.tipoInvestimentoConverter = tipoInvestimentoConverter;
    }

    public Investimento convert(InvestimentoDTO dto) {
        if (dto == null) return null;

        Investimento bo = new Investimento();

        bo.setId(dto.getId());
        bo.setNome(dto.getNome());
        bo.setTipoInvestimento(tipoInvestimentoConverter.convert(dto.getTipoInvestimento()));

        return bo;
    }

    public InvestimentoDTO convert(Investimento bo) {
        if (bo == null) return null;

        InvestimentoDTO dto = new InvestimentoDTO();

        dto.setId(bo.getId());
        dto.setNome(bo.getNome());
        dto.setTipoInvestimento(tipoInvestimentoConverter.convert(bo.getTipoInvestimento()));

        return dto;
    }

}
