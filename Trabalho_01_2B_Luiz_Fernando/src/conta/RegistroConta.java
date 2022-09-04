
package conta;

import java.time.LocalDate;
import java.util.Scanner;

public class RegistroConta {
    static final int MENU_ACESSAR_CC = 1;
    static final int MENU_ACESSAR_CP = 2;
    static final int MENU_DEPOSITO = 1;
    static final int MENU_SAQUE = 2;
    static final int MENU_SALDO = 3;
    static final int MENU_TRANSFERENCIA = 4;

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
        System.out.println("Cliente, informe o seu nome: ");
        String nome = teclado.next();
        System.out.println( nome + ", informe o seu CPF: ");
        String cpf = teclado.next();
        Cliente cliente = new Cliente(cpf,nome);
        
        Conta conta = new Conta();
        
        ContaCorrente contaCorrente = new ContaCorrente("1",200.0,LocalDate.now(),cliente);     
        ContaPoupanca contaPoupanca = new ContaPoupanca("1",200.0,LocalDate.now(),cliente);
        
       double opcao = 0;
       
       while (true){
            showMenuPrincipal();
            opcao = teclado.nextDouble();
            if (opcao == MENU_ACESSAR_CC) {
                while(true){
                    showMenuOpcao();
                    opcao = teclado.nextDouble();
                    if(opcao == MENU_DEPOSITO){
                        System.out.println("----------------------------");
                        System.out.println("SERÁ COMBRADO UMA TAXA DE 1 REAL PARA REALIZAÇÃO DO DEPOSITO");
                        System.out.println("DIGITE O VALOR DO DEPÓSITO:");
                        contaCorrente.deposito(teclado.nextDouble());
                        System.out.println("Saldo na Conta Corrente: " + contaCorrente.getSaldo());
                    } else if (opcao == MENU_SAQUE){
                        System.out.println("----------------------------");
                        System.out.println("SERÁ COMBRADO UMA TAXA DE 1 REAL PARA REALIZAÇÃO DO SAQUE");
                        System.out.println("DIGITE O VALOR DO SAQUE:");
                        if(contaCorrente.saque(teclado.nextDouble())){
                            System.out.println("SAQUE EFETUADO COM SUCESSO! SALDO NA CONTA CORRENTE: " + contaCorrente.getSaldo());
                        } else {
                            System.out.println("ERRO AO PROCESSAR O SAQUE! VALOR DISPONÍVEL PARA SAQUE: " + contaCorrente.getSaldo());
                        }  
                    } else if (opcao == MENU_SALDO){
                        System.out.println("----------------------------");
                        System.out.println("NOME:" + cliente.getNome());
                        System.out.println("CPF:" + cliente.getCpf());
                        System.out.println("DATA DE ABERTURA DA CONTA:" + contaCorrente.getDataAbertura());
                        System.out.println("SALDO ATUAL: " + contaCorrente.getSaldo()); 
                    } else if (opcao == MENU_TRANSFERENCIA){
                        System.out.println("----------------------------");
                        System.out.println("Informe o valor da transferencia: ");
                        if (contaCorrente.transferencia(contaCorrente, contaPoupanca, teclado.nextDouble())){
                           System.out.println("TRANSFERENCIA REALIZADA! ");
                           System.out.println("SALDO NA CONTA CORRENTE: " + contaCorrente.getSaldo());
                           System.out.println("SALDO NA CONTA POUPANÇA: " + contaPoupanca.getSaldo());
                        }else {
                            System.out.println("ERRO AO PROCESSAR A TRANSFERENCIA! VALOR DISPONIVEL PARA TRANSFERIR: " + contaCorrente.getSaldo());
                        }       
                    } else{
                        break;
                    }
                } 
            } else if (opcao == MENU_ACESSAR_CP){
                while(true){
                    showMenuOpcao();
                    opcao = teclado.nextDouble();
                    if(opcao == MENU_DEPOSITO){
                        System.out.println("----------------------------");
                        System.out.println("DIGITE O VALOR DO DEPÓSITO:");
                        contaPoupanca.deposito(teclado.nextDouble());
                        System.out.println("Saldo na Conta Corrente: " + contaPoupanca.getSaldo());
                    } else if (opcao == MENU_SAQUE){
                        System.out.println("----------------------------");
                        System.out.println("DIGITE O VALOR DO SAQUE:");
                        if(contaPoupanca.saque(teclado.nextDouble())){
                            System.out.println("SAQUE EFETUADO COM SUCESSO! SALDO NA CONTA CORRENTE: " + contaPoupanca.getSaldo());
                        } else {
                            System.out.println("ERRO AO PROCESSAR O SAQUE! VALOR DISPONÍVEL PARA SAQUE: " + contaPoupanca.getSaldo());
                        }  
                    } else if (opcao == MENU_SALDO){
                        System.out.println("----------------------------");
                        System.out.println("NOME:" + cliente.getNome());
                        System.out.println("CPF:" + cliente.getCpf());
                        System.out.println("DATA DE ABERTURA DA CONTA:" + contaPoupanca.getDataAbertura());
                        System.out.println("SALDO ATUAL: " + contaPoupanca.getSaldo()); 
                    } else if (opcao == MENU_TRANSFERENCIA){
                        System.out.println("----------------------------");
                        System.out.println("Informe o valor da transferencia: ");
                        if (contaPoupanca.transferencia(contaPoupanca, contaCorrente, teclado.nextDouble())){
                            System.out.println("TRANSFERENCIA REALIZADA! ");
                            System.out.println("SALDO NA CONTA POUPANÇA: " + contaPoupanca.getSaldo());
                            System.out.println("SALDO NA CONTA CORRENTE: " + contaCorrente.getSaldo());       
                        }else {
                            System.out.println("ERRO AO PROCESSAR A TRANSFERENCIA! VALOR DISPONIVEL PARA TRANSFERIR: " + contaPoupanca.getSaldo());
                        }       
                    } else{
                        break;
                    }
                } 
            } else {
                teclado.close();
                break;
            }
       }
            
        /*
        
        // Implementação para o método saque()
        ContaCorrente contaCorrente = new ContaCorrente("1",200.0,LocalDate.now(),cliente);
        contaCorrente.saque(100.0);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        
        ContaPoupanca contaPoupanca = new ContaPoupanca("2",200.0,LocalDate.now(),cliente);
        contaPoupanca.saque(100.0);
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());   
        
        // Implementação para o método deposito()
        contaCorrente.deposito(50.0);
        contaPoupanca.deposito(50.0);        
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());   
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());   

        // Implementação para realizar a transferência
        contaCorrente.transferencia(contaCorrente, contaPoupanca, 50.0);
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());   
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());           
        
        contaPoupanca.transferencia(contaPoupanca, contaCorrente, 100.0);        
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());   
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());  
        */
    
    }
    
   private static void showMenuPrincipal(){
        System.out.println("----------------------------");
        System.out.println("FAVOR ESCOLHER UMA OPÇÃO:");
        System.out.println("1 - ACESSAR CONTA CORRENTE");
        System.out.println("2 - ACESSAR CONTA POUPANÇA ");
        System.out.println("3 - ENCERRAR O SISTEMA");
    }
   
   private static void showMenuOpcao(){
        System.out.println("-----------------------------");
        System.out.println("FAVOR ESCOLHER UMA OPÇÃO:");
        System.out.println("1 - DEPOSITO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - SALDO");
        System.out.println("4 - TRANSFERENCIA");
        System.out.println("5 - VOLTAR");
    }
   
}
