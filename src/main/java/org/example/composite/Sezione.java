package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {
    //composite: può contenere sia Pagine che altre sezioni
    private String titolo;
    private List<ElementoLibro> listaElementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        this.listaElementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for(ElementoLibro e : listaElementi) {
            e.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int total = 0;
        for(ElementoLibro e : listaElementi) {
            total += e.getNumeroPagine();
        }
        return total;
    }
}
