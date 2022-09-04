/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {3,100,6,45,7};
        Arrays.sort(num);//Para colocar ele em ordem numerica
        for (int valor: num ){
            System.out.println(valor);
        }
        
    }
    
}
