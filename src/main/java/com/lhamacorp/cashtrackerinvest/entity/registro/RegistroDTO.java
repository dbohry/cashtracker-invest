package com.lhamacorp.cashtrackerinvest.entity.registro;


import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoDTO;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.LocalDate;

public class RegistroDTO {

    private Long id;
    private LocalDate data;
    private Long valor;
    private InvestimentoDTO investimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public InvestimentoDTO getInvestimento() {
        return investimento;
    }

    public void setInvestimento(InvestimentoDTO investimento) {
        this.investimento = investimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        RegistroDTO that = (RegistroDTO) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(data, that.data)
                .append(valor, that.valor)
                .append(investimento, that.investimento)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(data)
                .append(valor)
                .append(investimento)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("data", data)
                .append("valor", valor)
                .append("investimento", investimento)
                .toString();
    }
}
