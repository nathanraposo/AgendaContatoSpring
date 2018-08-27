package br.com.agendacontatospring.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contato {
    private int id;
    private String name;
    public static List<Contato> contatoList;

    static {
        contatoRepository();
    }

    public Contato(int id, String name) {
        this(name);
        this.name = name;
    }

    public Contato(String name) {
        this.name = name;
    }

    public Contato() {
    }

    public static void contatoRepository(){
        contatoList = new ArrayList<>( Arrays.asList(new Contato("Nathan"), new Contato("Mario")));
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
}