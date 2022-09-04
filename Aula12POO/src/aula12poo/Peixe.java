/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12poo;

/**
 *
 * @author Lenovo
 */
public class Peixe extends Animal {
    private String comEscama;
    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nada");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo planta");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nada");
    }

    public String getComEscama() {
        return comEscama;
    }

    public void setComEscama(String comEscama) {
        this.comEscama = comEscama;
    }
    
    
}
