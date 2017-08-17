package com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento;

import java.util.Arrays;
import java.util.Optional;

public enum TipoRendaEnum {

    RENDA_FIXA(1, "Renda Fixa"),
    RENDA_VARIAVEL(2, "Renda Variavel"),
    OUTRO(3, "Outro");

    TipoRendaEnum(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    private Integer id;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public static Optional<TipoRendaEnum> valueOfId(Integer id) {
        return Arrays.stream(values())
                .filter(v -> v.getId().equals(id))
                .findFirst();
    }

}
