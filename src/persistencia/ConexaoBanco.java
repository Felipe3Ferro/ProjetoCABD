/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public class ConexaoBanco {
    
    
    private static String URL = "jdbc:mysql://localhost:3306/medicoss";
    private static String USUARIO = "root";
    private static String SENHA = "";
    
    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro conectar! " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha metodo
    
}
