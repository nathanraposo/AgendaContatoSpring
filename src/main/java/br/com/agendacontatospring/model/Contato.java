package br.com.agendacontatospring.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Contato extends AbstractEntity {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}