/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a nota do 1° Bimestre: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a nota do 2º Bimestre: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Média foi: " + m);
        if (m > 9) {
            System.out.println("Parabens, O MISERAVEL É UM GÊNIO!!");
        }
        
                
    }
    
}
