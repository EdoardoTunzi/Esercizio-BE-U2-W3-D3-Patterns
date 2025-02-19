package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ElementoLibro {
    //root: contiene tutto il libro cioè l'insieme di sezioni e pagine con autore e prezzo
    private String titolo;
    private List<String> listaAutori;
    private double prezzo;
    private List<ElementoLibro> listaElementi = new ArrayList<>();

    public Libro(String titolo, List<String> listaAutori, double prezzo) {
        this.titolo = titolo;
        this.listaAutori = listaAutori;
        this.prezzo = prezzo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        listaElementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + listaAutori);
        System.out.println("Prezzo: " + prezzo + "€");
        for (ElementoLibro e : listaElementi) {
            e.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int total = 0;
        for (ElementoLibro e : listaElementi) {
            total += e.getNumeroPagine();
        }
        return total;
    }
}
