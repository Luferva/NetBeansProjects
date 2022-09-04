/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinaljava;

/**
 *
 * @author Luiz Fernando 
 */
public class ProjetoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video [3];
        v[0] = new Video ("Aula 1 de POO");
        v[1] = new Video ("Aula 2 de PHP");
        v[2] = new Video ("Aula 10  de HTML 5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto ("Luiz ", 22, "M", "anime");
        g[1] = new Gafanhoto ("Barbara", 23, "F", "otaku");
        
        Visualizacao vis = new Visualizacao(v[0], g[0]);
        System.out.println(vis.toString());
        
       /* System.out.println("VIDEOS \n -----------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n GAFANHOTO \n------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
        
        
    }
    
}
