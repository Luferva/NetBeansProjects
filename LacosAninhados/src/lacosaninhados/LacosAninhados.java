/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacosaninhados;

/**
 *
 * @author Lenovo
 */
public class LacosAninhados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i<=3; i++){
            for(int j = 0; j<=2; j+=2){
                System.out.print(i);
                System.out.println(j);
            }
        }
    }
    
}
