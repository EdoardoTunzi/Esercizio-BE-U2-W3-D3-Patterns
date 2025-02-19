package org.example.Adapter;

import java.time.LocalDate;

public class Adapter implements DataSource {

    private Info info;


    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        String nome = info.getNome();
        String cognome = info.getCognome();
        return nome +" "+ cognome;
    }

    @Override
    public int getEta() {
        int now = LocalDate.now().getYear();
        int dataNascita = info.getDataDiNascita().getYear();
        return now - dataNascita;
    }
}
