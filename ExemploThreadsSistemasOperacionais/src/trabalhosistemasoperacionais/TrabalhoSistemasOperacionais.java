
package trabalhosistemasoperacionais;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TrabalhoSistemasOperacionais {

    public static boolean stopProcess = false;
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                 
                for(int index = 0; index<100000; index++) {
                    //Verificação de numeros primos
                    System.out.println(index);
                    
                    
                    try {
                        Thread.sleep(50);// vai aguardar 50ms para que ele possa continuar executando
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TrabalhoSistemasOperacionais.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(stopProcess){
                        break;
                    }                     
                }
                
                
            }
        });
        
        thread.start();
        
         try {
                        Thread.sleep(500);// vai aguardar 50ms para que ele possa continuar executando
             } catch (InterruptedException ex) {
                        Logger.getLogger(TrabalhoSistemasOperacionais.class.getName()).log(Level.SEVERE, null, ex);
             }
         
         stopProcess = true;
    }
    
}
