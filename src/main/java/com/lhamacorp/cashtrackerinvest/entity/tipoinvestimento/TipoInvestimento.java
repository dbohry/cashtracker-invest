package com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;

@Entity
@Table(name = "tipo_investimento")
public class TipoInvestimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Integer tipoRendaEnum;

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

    public Integer getTipoRendaEnum() {
        return tipoRendaEnum;
    }

    public void setTipoRendaEnum(Integer tipoRendaEnum) {
        this.tipoRendaEnum = tipoRendaEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TipoInvestimento that = (TipoInvestimento) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(nome, that.nome)
                .append(tipoRendaEnum, that.tipoRendaEnum)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(nome)
                .append(tipoRendaEnum)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("nome", nome)
                .append("tipoRendaEnum", tipoRendaEnum)
                .toString();
    }
}
