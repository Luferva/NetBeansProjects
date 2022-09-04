
package prova_2b_luiz_fernando;

import java.util.Comparator;

/**
 *
 * @author Luiz Fernando
 */
public class ProdDescricaoComparator implements Comparator<Produto> {
    
    public int compare(Produto func1, Produto func2) {
        return func1.getDescricao().compareToIgnoreCase(func2.getDescricao());
    }
}
