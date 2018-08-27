package br.com.agendacontatospring.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Contato {
    private int id;
    private String name;
    public static List<Contato> contatoList;

    static {
        contatoRepository();
    }

    public Contato(int id, String name) {
        this(name);
        this.id = id;
    }

    public Contato(String name) {
        this.name = name;
    }

    public Contato() {
    }

    public static void contatoRepository(){
        contatoList = new ArrayList<>( Arrays.asList(new Contato(1,"Nathan"), new Contato(2,"Mario")));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}