/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero de pernas: ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2 :
                tipo = "Bipedi";
                break;
            case 3 :
                tipo = "Cavalo de Tres pernas";
                break;
            case 4 :
                tipo = "Quadrupedi";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;   
        }
        System.out.println(tipo);
            
        
    }
    
}
