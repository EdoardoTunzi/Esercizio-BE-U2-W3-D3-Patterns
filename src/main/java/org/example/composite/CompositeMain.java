package org.example.composite;

import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        Pagina p1 = new Pagina("Contenuto di pagina 1...");
        Pagina p2 = new Pagina("Contenuto di pagina 2...");

        Sezione s1 = new Sezione("Capitolo 1");
        s1.aggiungiElemento(p1);
        s1.aggiungiElemento(p2);


        Libro libro = new Libro("Maledetti Design Pattern", List.of("Autore1", "Autore2"), 2.50 );
        libro.aggiungiElemento(s1);
        libro.aggiungiElemento(new Pagina("Introduzione"));

        libro.stampa();
        System.out.println("Numero pagine nel libro: " + libro.getNumeroPagine());

    }
}
