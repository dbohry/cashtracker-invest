package com.lhamacorp.cashtrackerinvest.entity.registro;

import com.lhamacorp.cashtrackerinvest.entity.investimento.Investimento;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.LocalDate;

import javax.persistence.*;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate data;
    private Long valor;

    @ManyToOne
    @JoinColumn(name = "investimento_id")
    private Investimento investimento;

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

    public Investimento getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Registro registro = (Registro) o;

        return new EqualsBuilder()
                .append(id, registro.id)
                .append(data, registro.data)
                .append(valor, registro.valor)
                .append(investimento, registro.investimento)
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
