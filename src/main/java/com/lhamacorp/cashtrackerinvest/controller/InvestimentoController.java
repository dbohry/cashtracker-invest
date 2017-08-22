package com.lhamacorp.cashtrackerinvest.controller;

import com.lhamacorp.cashtrackerinvest.entity.investimento.Investimento;
import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoConverter;
import com.lhamacorp.cashtrackerinvest.entity.investimento.InvestimentoDTO;
import com.lhamacorp.cashtrackerinvest.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ct/secure/investimentos")
public class InvestimentoController {

    private InvestimentoService service;
    private InvestimentoConverter converter;

    @Autowired
    public InvestimentoController(InvestimentoService service,
                                  InvestimentoConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<InvestimentoDTO>> getAll(@RequestHeader("authorization") String token) {
        List<Investimento> response = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(response.stream()
                .map(converter::convert)
                .collect(Collectors.toList()));
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<InvestimentoDTO> save(@RequestBody InvestimentoDTO dto,
                                                @RequestHeader("authorization") String token) {
        Investimento response = service.save(converter.convert(dto));
        return ResponseEntity.status(HttpStatus.OK).body(converter.convert(response));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<InvestimentoDTO> update(@PathVariable("id") Long id,
                                                  @RequestBody InvestimentoDTO dto,
                                                  @RequestHeader("authorization") String token) {
        dto.setId(id);
        Investimento response = service.update(converter.convert(dto));
        return ResponseEntity.status(HttpStatus.OK).body(converter.convert(response));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable("id") Long id,
                                         @RequestHeader("authorization") String token) {
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

}
