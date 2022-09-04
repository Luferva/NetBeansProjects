/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Lenovo
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        
        while (cc<10){
            cc++;
            if (( cc == 3) || (cc == 4)){ 
                continue;// serve para voltar para condição 
            }
            if (cc == 8){
                break;//serve para jogar fora do laço
            }
            System.out.println("Cambalhota " + cc);
          
        }
        
        
    }
    
}
