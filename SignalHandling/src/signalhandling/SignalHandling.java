/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signalhandling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SignalHandling {
    
    public static ArrayList<ThreadController> controllers = new ArrayList<ThreadController>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        for(int index = 0; index < 100; index ++){
            
            Thread thread = new Thread(new Runnable(){
                @Override
                public void run() {
                   
                    ThreadController controller = new ThreadController();
                    controllers.add(controller);
                    
                    while(!controller.isCanExecute()){
                        
                    }
                    
                    System.out.println("Thread Executada");
                    
                }
            });
            
            thread.start();
        }
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            System.out.println("Digite o numero da Thread que deseja liberar: ");
            int position = scanner.nextInt();
            if (position > controllers.size()){
                break;
            }else{
                controllers.get(position).setCanExecute(true);
            }
        }
    }
    
}
