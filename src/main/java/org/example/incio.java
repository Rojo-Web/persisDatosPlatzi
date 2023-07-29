package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class incio {
    public static void main(String[] args) throws SQLException {
        conexion conec = new conexion();
        try(Connection crx = conec.get_conect() ) {
            System.out.println("logramos");
        }catch ( Exception e){
            System.out.println(e);
        }
    }
}
