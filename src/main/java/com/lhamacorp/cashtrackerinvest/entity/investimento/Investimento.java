package com.lhamacorp.cashtrackerinvest.entity.investimento;

import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimento;

import javax.persistence.*;

@Entity
@Table(name = "investimentos")
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @OneToOne
    @JoinTable(
            name = "investimentos_tipo_investimento",
            joinColumns = @JoinColumn(
                    name = "investimento_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "tipo_investimento_id", referencedColumnName = "id"))
    private TipoInvestimento tipoInvestimento;

}
