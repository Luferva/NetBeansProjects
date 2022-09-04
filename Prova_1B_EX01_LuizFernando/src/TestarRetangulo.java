
import java.util.Scanner;

public class TestarRetangulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Retangulo numb1;
        numb1 = new Retangulo();

        System.out.print("Informe o valor da altura: ");
        int altura = teclado.nextInt();

        System.out.print("Informe o valor da largura: ");
        int largura = teclado.nextInt();

        numb1.setAltura(altura);
        numb1.setLargura(largura);

        System.out.print("Calculo da Área é " + numb1.area());
        System.out.println(" e o calculo do Perimetro é " + numb1.perimetro());

    }

}
