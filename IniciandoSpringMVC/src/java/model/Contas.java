/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Eduardo Rocha
 */
public class Contas {
    private String nome;
       private String cpf;
       private String descricao;
       private Date dataVencimento;
       private float valor;
       
       public String getNome() {
            return nome;
       }
       
       public void setNome(String nome) {
            this.nome = nome;
       }
       
       public String getCpf() {
            return cpf;
       }
       
       public void setCpf(String cpf) {
            this.cpf = cpf;
       }
       
       
       public String getDescricao() {
            return descricao;
       }
       
       public void setDescricao(String descricao) {
            this.descricao = descricao;
       }
   
       public Date getDataVencimento() {
            return dataVencimento;
       }
   
       public void setDataVencimento(Date dataVencimento) {
            this.dataVencimento = dataVencimento;
       }
   
       public float getValor() {
            return valor;
       }
   
       public void setSalario(float salario) {
            this.valor = valor;
       }
}
