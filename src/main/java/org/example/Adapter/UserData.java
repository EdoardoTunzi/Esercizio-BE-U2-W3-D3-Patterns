package org.example.Adapter;

public class UserData {

    private String nomeCompleto;
    private int eta;


    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", eta=" + eta +
                '}';
    }
}