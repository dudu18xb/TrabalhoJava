/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author elisabeth
 */
public class Contabanco {
    public int numCOnta;
    protected String tipo;
   // private String dono;
    private float saldo;
    private boolean status;
    
    
    //metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus((true));
        if(t == "CC"){
        this.setSaldo(50);
        }else if (t == "CP"){
        this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    
    }
    public void depositar(float v){
        if (this.getStatus()) {
       // this.saldo = this.saldo + v;
        this.setSaldo(this.getSaldo() + v);
            //System.out.println("Deposito realizado com sucesso" + this.getDono());
    }
        else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
               //System.out.println("Saque realizado na conta de " + this.getDono());
            }System.out.println("Saldo insuficiente para saque");
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    
    }
    //metodos especiais

    //construtor
    public Contabanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumCOnta() {
        return numCOnta;
    }

    public void setNumCOnta(int numCOnta) {
        this.numCOnta = numCOnta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

 /*   public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
*/

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
       
    
}
