/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeShopping;

import java.util.Comparator;

/**
 *
 * @author Sara
 */
public class SortToNameProd implements Comparator<CollegeProduct> {
    @Override
    public int compare(CollegeProduct x, CollegeProduct y) {
        return x.product.compareTo(y.product);
    }
}
