package com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento;

import org.springframework.stereotype.Component;

@Component
public class TipoInvestimentoConverter {

    public TipoInvestimentoDTO convert(TipoInvestimento bo) {
        if (bo == null) return null;

        TipoInvestimentoDTO dto = new TipoInvestimentoDTO();

        dto.setId(bo.getId());
        dto.setNome(bo.getNome());
        dto.setTipoRendaEnum(TipoRendaEnum.valueOfId(bo.getTipoRendaEnum()).orElse(null));

        return dto;
    }

    public TipoInvestimento convert(TipoInvestimentoDTO dto) {
        if (dto == null) return null;

        TipoInvestimento bo = new TipoInvestimento();

        bo.setId(dto.getId());
        bo.setNome(dto.getNome());
        bo.setTipoRendaEnum(dto.getTipoRendaEnum() != null ? dto.getTipoRendaEnum().getId() : null);

        return bo;
    }

}
