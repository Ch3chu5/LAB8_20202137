package com.example.pruebalaboratorio1.daos;

import com.example.pruebalaboratorio1.beans.genero;
import com.example.pruebalaboratorio1.beans.pelicula;
import com.example.pruebalaboratorio1.beans.streaming;

import java.sql.*;
import java.util.ArrayList;

public abstract class baseDao {



    public boolean validarBorrado(pelicula movie) {

        ArrayList<pelicula> listaPeliculas = new ArrayList<>();
        boolean validador = true;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=America/Lima";
        String username = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            int(get)
            int duracion = rs.getInt("duracion")
            boolean validador = true;
            if(validador){


                boolean validador= validarBorrado(movie);
                movie.setValidadorBorrado(validador);

                listaPeliculas.remove(movie);
            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return validador;
    }










    }
}

