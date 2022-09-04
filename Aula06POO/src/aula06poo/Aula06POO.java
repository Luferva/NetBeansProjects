/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06poo;

/**
 *
 * @author Luiz Fernando Ribeiro Vargas
 */
public class Aula06POO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
