/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_2b_luiz_fernando;

import java.util.Comparator;

/**
 *
 * @author Lenovo
 */
public class ProdStatusComparator implements Comparator<Produto> {
    
    public int compare(Produto func1, Produto func2) {
        return func1.getStatus().compareToIgnoreCase(func2.getStatus());
    }
}
