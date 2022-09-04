package registrodeconta;

import java.util.Scanner;

public class RegistroDeConta {

    static final int MENU_ACESSAR = 1;
    static final int MENU_DEPOSITO = 1;
    static final int MENU_SAQUE = 4;
    static final int MENU_SALDO = 3;

    public static void main(String[] args) {
        
        Cliente cliente = new cliente();
        cliente.
        

        Scanner scan = new Scanner(System.in);
        double opcao = 0;
        while (true) {
            showMenuInicial();
            System.out.println("Digite um valor");
            opcao = scan.nextDouble();
            if (opcao == 0) {
                break;
            } else {
                System.out.println("Digite o valor 0 para encerrar o programa");
            }

        }

    }

    private static void showMenuInicial() {
        System.out.println("Favor escolher uma opção:");
        System.out.println("1 - Acessar o sistema");
        System.out.println("2 - Encerrar o sistema");
        System.out.println("3 - Bem vindo");
    }

}
