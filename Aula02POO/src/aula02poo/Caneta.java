
package aula02poo;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
            
    void status (){
        System.out.print("Uma caneta " + this.cor);
        System.out.println(" esta tampada ?" + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cargas: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }
    
    
    void rabiscar(){
        if (tampada == true) {
            System.out.println("Erro não posso rabiscar");
        } else {
             System.out.println("Estou rabiscando");
        }
        }   
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
         this.tampada = false;
    }
}
