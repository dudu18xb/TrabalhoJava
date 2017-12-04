/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import dominio.Cadastro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author elisabeth
 */
public class CadastroDAO {
        public void adiciona(Cadastro cadastro) throws SQLException{
            
            Conexao conn = new Conexao();
            
            String sql = "Insert into cadastro(nome, endereco, telefone, tipo) values(?, ?, ?)";
            
                PreparedStatement ps = conn.getConexao().prepareStatement(sql);
                
                ps.setString(1, cadastro.getNome());
                ps.setString(2, cadastro.getEndereco());
                ps.setInt(3, cadastro.getTelefone());
                ps.setString(4, cadastro.getTipo());
                
                ps.execute();
        } 
        
    
}
