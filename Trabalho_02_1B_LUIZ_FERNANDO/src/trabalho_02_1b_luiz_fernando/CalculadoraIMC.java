
package trabalho_02_1b_luiz_fernando;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    Pessoa numb1;
    numb1 = new Pessoa();
    
        System.out.println("Digite o peso da pessoa:");
        numb1.peso = teclado.nextInt();
        
        System.out.println("Digite a altura da pessoa:");
        numb1.altura = teclado.nextDouble();
        
        teclado.nextLine();
    
        System.out.printf("O IMC dessa pessoa é %.2f - %s\n", numb1.calculoIMC(), numb1.obterIMC());    
            
    }
    
}
