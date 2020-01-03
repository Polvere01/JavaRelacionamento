package com.estudos.Relacionamento.controller;

import com.estudos.Relacionamento.model.Contrato;
import com.estudos.Relacionamento.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContratoController {

    @Autowired
    public ContratoRepository contratoRepository;

    @PostMapping(path = "/salvar")
    public Long SalvarContrato(@RequestBody Contrato contrato){

        return contratoRepository.save(contrato).getId();
    }

}
