/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alum.fial7
 */
public class Conexion {
    private static String url ="jdbc:mysql://localhost/db_visitas";
    private static String usuario="root";
    private static String clave="root";
    private static Connection conex=null;
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jddbc.Driver");
            conex = DriverManager.getConnection(url, usuario, clave);
        }catch(ClassNotFoundException | SQLException e){
        }
        return conex;
    }
}
