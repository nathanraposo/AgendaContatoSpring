package br.com.agendacontatospring.model;

import javax.persistence.Entity;

@Entity
public class Contato extends AbstractEntity {

    //@Column(name = "nome_contato")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}