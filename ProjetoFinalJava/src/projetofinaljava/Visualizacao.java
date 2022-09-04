/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

/**
 *
 * @author Lenovo
 */
public class Visualizacao {
    
    private Video filme;
    private Gafanhoto espectador;

    public Visualizacao(Video filme, Gafanhoto espectador) {
        this.filme = filme;
        this.espectador = espectador;
    }
    
    
    
    public void avaliar(){
        
    }
    
    public void avaliar(int nota){
        
    }
    
    public void avaliar (float porc){
        
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "filme=" + filme + ", espectador=" + espectador + '}';
    }
    
    
    
}
