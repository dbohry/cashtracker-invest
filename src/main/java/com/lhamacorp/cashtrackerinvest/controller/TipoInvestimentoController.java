package com.lhamacorp.cashtrackerinvest.controller;

import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimento;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimentoConverter;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimentoDTO;
import com.lhamacorp.cashtrackerinvest.service.TipoInvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ct/secure/tipo-investimentos")
public class TipoInvestimentoController {

    private TipoInvestimentoService service;
    private TipoInvestimentoConverter converter;

    @Autowired
    public TipoInvestimentoController(TipoInvestimentoService service,
                                      TipoInvestimentoConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<TipoInvestimento>> getAll(@RequestHeader("authorization") String token) {
        return ResponseEntity.status(HttpStatus.OK).body(Collections.emptyList());
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<TipoInvestimentoDTO> save(@RequestBody TipoInvestimentoDTO dto,
                                                 @RequestHeader("authorization") String token) {
        TipoInvestimento response = service.save(converter.convert(dto));
        return ResponseEntity.status(HttpStatus.OK).body(converter.convert(response));
    }

}
