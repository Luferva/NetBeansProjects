/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //JOptionPane.showMessageDialog(null, "Ola Mundo", "Boa Vindas", JOptionPane.INFORMATION_MESSAGE);
      int  n, s = 0;
      int v = 0;
      int par = 0;
      int impar = 0;
      do {
      n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:(O Valor 0 interronpe)"));
      //JOptionPane.showMessageDialog(null, "O numero diagitado é: " + n);
      v ++;
      s = s + n;    
      
        }while(n!=0);
      JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr>" + "<br>Somatorio vale: " + s + 
              "<br> Qnt de numeros Digitados: " + v + "</html>");
      
    }
    
}
