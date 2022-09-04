/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivossecond;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TiposPrimitivosSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        System.out.format("Sua nota %s é %.2f \n", nome, nota);
                
    }
    
}
