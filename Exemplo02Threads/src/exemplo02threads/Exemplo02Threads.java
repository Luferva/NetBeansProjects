
package exemplo02threads;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Exemplo02Threads {

    public static boolean stopProcess = false;
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        for(int pessoas = 0; pessoas < 10000; pessoas++){
            
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                Exemplo02Threads main = new Exemplo02Threads();  
                
                if(stopProcess){
                    return;
                }
                main.acessarConta();
                if(stopProcess){
                    return;
                }
                main.consultaSaldo();
                if(stopProcess){
                    return;
                }
                main.extrato();
                if(stopProcess){
                    return;
                }
                main.fazerPix();
            }
        });    
        
        thread.start();
        }
        
        Scanner scanner = new Scanner(System.in);
        int teclado = scanner.nextInt();
        stopProcess = true;
    }
    
    private void acessarConta(){
        
        try {
            Thread.sleep(10); 
        } catch (InterruptedException ex) {
            Logger.getLogger(Exemplo02Threads.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Conta Acessada");
    }
    
    private void consultaSaldo(){
        System.out.println("Seu saldo é:" + new Random().nextInt(10000));
    }
    
    private void extrato(){
        System.out.println("Transações bancarias:");
        System.out.println("compra no mercado: - ");
        System.out.println("compra no panificadora: - ");
         System.out.println("compra no cinema: - ");
    }
    
    private void fazerPix(){
        System.out.println("Pix realizado:");
    }
}
