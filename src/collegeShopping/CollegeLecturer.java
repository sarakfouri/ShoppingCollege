/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeShopping;
import java.util.*; 
/**
 *
 * @author Sara
 */
public class CollegeLecturer extends CollegeProduct {
    
        public CollegeLecturer (String product, double price, int quantity){
            this.product = product;
            this.price = price;
            this.quantity = quantity;
     
}
public List<CollegeProduct> searchProduct (List<CollegeProduct> prod, String search, double SpellMoney){
    List<CollegeProduct> budget  = new ArrayList<>();
    int count = 0;
    for (CollegeProduct pro : prod) {
                    if ((pro.product.toUpperCase().equals(search.toUpperCase())) & (pro.price < SpellMoney)) {
                        System.out.println("Product: " + pro.product + " Price: " + pro.price + " Quantity: " + pro.quantity);
                        pro.quantity = 1 ;
                        budget.add(pro);
                    }
                       else if ((pro.product.toUpperCase().equals(search.toUpperCase())) & (pro.price > SpellMoney)) {
                        System.out.println("This product exceeds the amount you want to spend per product.");
                       
                    }else {
                        count++;
                            if (prod.size() <= count) {
                                System.out.println("Product: " + search + " Price: Free");
                                break;
                    }
    }
  
                 
}
return budget;
}
}
