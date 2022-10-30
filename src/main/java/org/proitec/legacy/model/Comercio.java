package org.proitec.legacy.model;

import javax.persistence.*;

@Entity
public class Comercio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="descricao")
    String descricao;

    public Comercio(String descricao) {
        this.descricao = descricao;
    }

    public Comercio() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
