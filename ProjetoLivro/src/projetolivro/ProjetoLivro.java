
 
package projetolivro;

/**
 *
 * @author Luiz Fernando Ribeirpo Vargas
 */
public class ProjetoLivro {

    
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Luiz", 22, "M");
        p[1] = new Pessoa("Cesar", 21, "M");

        
        l[0]= new Livro("Pai Rico", "Sergio", 150, p[0]);
        l[1]= new Livro("Aprendendo Java", "Jose", 300, p[0]);
        l[2]= new Livro("Arte da Guerra", "Sung", 200, p[1]);
        
        
        l[0].abrir();
        l[0].folhear(35);
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
        
         System.out.println(l[2].detalhes());
         
        
    }
    
}
