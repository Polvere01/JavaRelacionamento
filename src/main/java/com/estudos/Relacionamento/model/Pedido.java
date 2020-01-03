package com.estudos.Relacionamento.model;

import javax.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;

    @OneToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    private int Os;

    public Pedido() {
    }

    public int getOs() {
        return Os;
    }

    public void setOs(int os) {
        Os = os;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
