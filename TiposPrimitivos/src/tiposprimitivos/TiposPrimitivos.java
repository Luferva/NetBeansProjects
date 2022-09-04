/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome = "gustavo";
        float nota = 8.5f;
        System.out.println("Sua nota " + nota); // exemplo 1
        System.out.printf("Sua nota %s é %.2f \n", nome, nota); // exemplo 2: .2 para decidir as casas decimais 
        System.out.format("Sua nota %s é %.2f \n", nome, nota); // exemplo 3
        
       
    }
    
}
