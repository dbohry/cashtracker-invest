package com.lhamacorp.cashtrackerinvest;

import com.lhamacorp.cashtrackerinvest.entity.investimento.Investimento;
import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoConverter;
import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoDTO;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimento;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimentoConverter;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimentoDTO;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InvestimentoConverterTest {

    private static final Long ID = 1L;
    private static final String NOME = "investimento";

    private InvestimentoConverter converter;
    private TipoInvestimentoConverter tipoInvestimentoConverter;

    @Before
    public void setUp() {
        tipoInvestimentoConverter = new TipoInvestimentoConverter();

        converter = new InvestimentoConverter(tipoInvestimentoConverter);
    }

    @Test
    public void deveVerificarQuandoNulo() {
        assertThat(converter.convert((Investimento) null), is(nullValue()));
        assertThat(converter.convert((InvestimentoDTO) null), is(nullValue()));
    }

    @Test
    public void deveConverterParaDTO() {
        assertThat(converter.convert(build()), is(buildDTO()));
    }

    @Test
    public void deveConverterParaBO() {
        assertThat(converter.convert(buildDTO()), is(build()));
    }

    private Investimento build() {
        Investimento bo = new Investimento();

        bo.setId(ID);
        bo.setNome(NOME);
        bo.setTipoInvestimento(new TipoInvestimento());

        return bo;
    }

    private InvestimentoDTO buildDTO() {
        InvestimentoDTO dto = new InvestimentoDTO();

        dto.setId(ID);
        dto.setNome(NOME);
        dto.setTipoInvestimento(new TipoInvestimentoDTO());

        return dto;
    }


}
