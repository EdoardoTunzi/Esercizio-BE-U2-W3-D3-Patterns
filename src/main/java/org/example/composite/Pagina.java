package org.example.composite;

public class Pagina implements ElementoLibro{
    //foglia: non contiene nulla, ma ha i metodi richiesti
    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina: " + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
