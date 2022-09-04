/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetrabalhoso;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class TesteTrabalhoSO {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<ThreadController> controllers = new ArrayList<ThreadController>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
      
        System.out.println("Digite a quantidade de processos(Threads) que você deseja: ");
        int numbThread = teclado.nextInt();
        
        System.out.println("Digite o tempo(ms) que levará para executar cada processo: ");
        int tempoThread = teclado.nextInt();
        
        
         for(int index = 0; index < numbThread; index ++){
             Thread thread = new Thread(new Runnable(){
                 @Override
                 public void run() {
                     
                    ThreadController controller = new ThreadController();
                    controllers.add(controller);
                    
                    
                    while(!controller.isCanExecute()){}
                    
                     System.out.println("Thread Executada");
                     
                 }
                 
             });
             
             thread.start();
         }
         
         while(true) {
            
            
            for (int position = 0; position < controllers.size(); position++){
            if (position > controllers.size()){
                break;
            }else{
                try {     
                   
                    Thread.sleep(tempoThread);
                    } catch (InterruptedException ex) {
                    Logger.getLogger(TesteTrabalhoSO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                controllers.get(position).setCanExecute(true);
            }
            
            }
              
        }
         
    }
    
}
