/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cadastro;
import java.sql.SQLException;

/**
 *
 * @author elisabeth
 */
public class Teste {
    public static void main(String[] args) {
        
        Cadastro cadastro = new Cadastro();
        CadastroDAO dao = new CadastroDAO();
        
        cadastro.setNome("rafael");
        cadastro.setEndereco("rua");
        cadastro.setTelefone(123123123);
        //cadastro.setTipo("CC");
        
        try {
            dao.adiciona(cadastro);
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    
    
}
