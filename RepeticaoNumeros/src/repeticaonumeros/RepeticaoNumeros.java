/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaonumeros;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class RepeticaoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt(); //resposta em inteiro
            s += n; // isso é igual a "s = s + n"
            System.out.print("Deseja Continuar?[S/N] ");
            resp = teclado.next();//resposta em texto
        }while(resp.equals("S"));
        System.out.println("A soma dos numeros é: "+ s);
    }
    
}
