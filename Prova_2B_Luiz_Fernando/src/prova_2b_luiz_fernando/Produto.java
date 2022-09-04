
package prova_2b_luiz_fernando;



/**
 *
 * @author Luiz Fernando Ribeiro Vargas
 */

public class Produto implements Comparable<Produto>{

    private Integer id;
    private String descricao;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;
    private String status;

    public Produto(){
        
    }
    
    @Override
    public  String toString(){
        return "ID:" + id + " - Descrição: " + descricao + " - Estoque Minimo: " + estoqueMinimo + " - Estoque Maximo: " + estoqueMaximo + " - Status: " + status;
    }
    
    
    @Override
    public int compareTo(Produto outro) {
        return this.id - outro.id;
    }
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        
        this.estoqueMinimo = estoqueMinimo;
    }

    public Integer getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Integer estoqueMaximo) {
        
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        
        this.status = status;
    }
    
    
}
