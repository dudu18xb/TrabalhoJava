/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author elisabeth
 */
public class Conexao {
    private Connection conn;
    private void conectar(){
        System.out.println("Conectando ao banco....");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iniciandospring", "root", "");
            System.out.println("Conectado..");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada, adicione o driver na biblioteca");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    public Connection getConexao(){
        conectar();
        return conn;
    }
}
