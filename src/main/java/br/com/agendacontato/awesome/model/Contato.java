package br.com.agendacontato.awesome.model;

public class Contato {
    private String name;

    public Contato(String name) {
        this.name = name;
    }

    public Contato() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
