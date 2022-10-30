package org.proitec.legacy.model;

import javax.persistence.*;

@Entity
public class Comercio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "descricao")
    String descricao;

    public Comercio(String descricao) {
        this.descricao = descricao;
    }

    public Comercio() {
    }

    public long getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }


}
