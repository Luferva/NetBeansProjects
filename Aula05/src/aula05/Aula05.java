/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;


public class Aula05 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Luiz Fernando");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Barbara");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
       
        
    }
    
}
