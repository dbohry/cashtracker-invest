package com.lhamacorp.cashtrackerinvest.entity.investimento;

import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimento;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class InvestimentoDTO {

    private Long id;
    private String nome;
    private TipoInvestimento tipoInvestimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoInvestimento getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        InvestimentoDTO that = (InvestimentoDTO) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(nome, that.nome)
                .append(tipoInvestimento, that.tipoInvestimento)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(nome)
                .append(tipoInvestimento)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("nome", nome)
                .append("tipoInvestimento", tipoInvestimento)
                .toString();
    }
}
