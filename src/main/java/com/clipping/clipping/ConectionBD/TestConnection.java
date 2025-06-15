package com.clipping.clipping.ConectionBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/clipping_bd?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexão bem-sucedida com o MySQL!");
        } catch (Exception e) {
            System.out.println("Falha na conexão:");
            e.printStackTrace();
        }
    }
}