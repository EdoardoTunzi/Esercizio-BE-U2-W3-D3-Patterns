package org.example.Adapter;

import java.time.LocalDate;

public class AdapterMain {
    public static void main(String[] args) {
        Info info = new Info("Giovanni", "Nigro", LocalDate.of(1990,7,14));
        Adapter adapter = new Adapter(info);
        UserData userData = new UserData();
        userData.getData(adapter);
        System.out.println(userData);
    }
}
