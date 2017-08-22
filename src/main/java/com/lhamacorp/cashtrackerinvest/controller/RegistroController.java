package com.lhamacorp.cashtrackerinvest.controller;

import com.lhamacorp.cashtrackerinvest.entity.registro.Registro;
import com.lhamacorp.cashtrackerinvest.entity.registro.RegistroConverter;
import com.lhamacorp.cashtrackerinvest.entity.registro.RegistroDTO;
import com.lhamacorp.cashtrackerinvest.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ct/secure/registros")
public class RegistroController {

    private RegistroService service;
    private RegistroConverter converter;

    @Autowired
    public RegistroController(RegistroService service,
                              RegistroConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<RegistroDTO>> getAll(@RequestHeader("authorization") String token) {
        List<Registro> response = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(response.stream()
                .map(converter::convert)
                .collect(Collectors.toList()));
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<RegistroDTO> save(@RequestBody RegistroDTO dto,
                                            @RequestHeader("authorization") String token) {
        Registro response = service.save(converter.convert(dto));
        return ResponseEntity.status(HttpStatus.OK).body(converter.convert(response));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<RegistroDTO> update(@PathVariable("id") Long id,
                                              @RequestBody RegistroDTO dto,
                                              @RequestHeader("authorization") String token) {
        dto.setId(id);
        Registro response = service.update(converter.convert(dto));
        return ResponseEntity.status(HttpStatus.OK).body(converter.convert(response));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable("id") Long id,
                                         @RequestHeader("authorization") String token) {
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
