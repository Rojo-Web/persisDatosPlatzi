package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public Connection get_conect(){
        Connection conx = null;
        try{
           conx = DriverManager.getConnection("jdbc:mysql://localhost:3306/persisdatos","root","");
            if (conx == null) {
                System.out.println("Conection exitosa");
            }
        }catch(SQLException e) {
            System.out.println(e);
        }
        return conx;
    }
}
