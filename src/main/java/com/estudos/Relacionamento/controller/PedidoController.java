package com.estudos.Relacionamento.controller;

import com.estudos.Relacionamento.model.Contrato;
import com.estudos.Relacionamento.model.Pedido;
import com.estudos.Relacionamento.repository.ContratoRepository;
import com.estudos.Relacionamento.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    public PedidoRepository pedidoRepository;

    @Autowired
    public ContratoRepository contratoRepository;


    @PostMapping(path = "/pedido/{id}")
    public Long Salvar(@RequestBody Pedido pedido, @PathVariable(value = "id") Long id){

        Contrato contrato = contratoRepository.findById(id).get();
        pedido.setContrato(contrato);
        return  pedidoRepository.save(pedido).getId();
    }
}
