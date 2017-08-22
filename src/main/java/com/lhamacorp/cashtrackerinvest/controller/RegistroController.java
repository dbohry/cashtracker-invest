package com.lhamacorp.cashtrackerinvest.controller;

import com.lhamacorp.cashtrackerinvest.entity.registro.RegistroDTO;
import com.lhamacorp.cashtrackerinvest.entity.tipoinvestimento.TipoInvestimentoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ct/secure/registros")
public class RegistroController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<RegistroDTO>> getAll(@RequestHeader("authorization") String token) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<RegistroDTO> save(@RequestBody TipoInvestimentoDTO dto,
                                                @RequestHeader("authorization") String token) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<RegistroDTO> update(@PathVariable("id") Long id,
                                              @RequestBody TipoInvestimentoDTO dto,
                                              @RequestHeader("authorization") String token) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable("id") Long id,
                                         @RequestHeader("authorization") String token) {
        return null;
    }
}
