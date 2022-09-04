
package prova_2b_luiz_fernando;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Luiz Fernando Ribeiro Vargas
 */
public class Prova_2B_Luiz_Fernando {

    private static List<Produto> lista;
    static final int MENU_INCLUIR = 1;
    static final int MENU_ORDENAR = 2;
    static final int MENU_INVERTER = 3;
    static final int MENU_DESORDENAR = 4;
    static final int MENU_RELATORIO = 5;
    static final int MENU_ID = 1;
    static final int MENU_DESCRICAO = 2;
    static final int MENU_STATUS = 3;
    
    public static void main(String[] args) {
                  
         Scanner teclado = new Scanner(System.in);
          lista = new LinkedList<>();

         double opcao = 0;

         while (true){

            showMenuPrincipal();
            opcao = teclado.nextDouble();
            
            if (opcao == MENU_INCLUIR) {
                Produto produto = new Produto();
                System.out.println("Informe o id do produto: ");
                produto.setId(teclado.nextInt());
                System.out.println("Informe a descricao do produto: ");
                produto.setDescricao(teclado.next());
                System.out.println("Informe a estoque minimo do produto: ");
                produto.setEstoqueMinimo(teclado.nextInt());
                System.out.println("Informe o estoque maximo do produto: ");
                produto.setEstoqueMaximo(teclado.nextInt());
                System.out.println("Informe o status do produto: ");
                produto.setStatus(teclado.next());
                lista.add(produto);

            }else if (opcao == MENU_ORDENAR){
                while(true){
                    showMenuOrdenar();
                    opcao = teclado.nextDouble();
                    if (opcao == MENU_ID) {
                        Collections.sort(lista);
                    }else if(opcao == MENU_DESCRICAO){
                        Collections.sort(lista, new ProdDescricaoComparator());
                    }else if(opcao == MENU_STATUS){
                        Collections.sort(lista, new ProdStatusComparator());
                    }   
                    else {
                        break;
                    }
                }
            }else if (opcao == MENU_INVERTER){
                Collections.sort(lista, Collections.reverseOrder());
                
            }else if(opcao ==MENU_DESORDENAR){
                Collections.shuffle(lista);
                
            }else if(opcao == MENU_RELATORIO){
                String str = "Produtos cadastrados:\n";
                 if (lista.isEmpty()) {
                     str += "\n Lista de produtos vazia!";
                } else {
                      for (Produto cc : lista) {
                          str += "\n" + cc;
                      }    
                }
                   System.out.println(str); 
            }else{
                  teclado.close();
                  break;
                }
         
         }
    
    }
    
    private static void showMenuPrincipal(){
        System.out.println("----------------------------");
        System.out.println("FAVOR ESCOLHER UMA OPÇÃO:");
        System.out.println("1 - INCLUIR");
        System.out.println("2 - ORDENAR ");
        System.out.println("3 - INVERTER");
        System.out.println("4 - DESORDENAR");
        System.out.println("5 - RELATÓRIO");
    }
   
   private static void showMenuOrdenar(){
        System.out.println("-----------------------------");
        System.out.println("FAVOR ESCOLHER UMA OPÇÃO PARA ORDENAR A LISTA:");
        System.out.println("1 - ID");
        System.out.println("2 - DESCRIÇÃO");
        System.out.println("3 - STATUS");
    }
    
    
    
}
