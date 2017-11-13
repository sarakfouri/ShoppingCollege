/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeShopping;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class CollegeProducts {

    public static void main(String[] args) {
        CollegeLecturer p = new CollegeLecturer("Apple", 2.4, 5);
        CollegeLecturer p1 = new CollegeLecturer("Rice", 1.69, 10);
        CollegeLecturer p2 = new CollegeLecturer("Banana", 1.35, 15);
        CollegeLecturer p3 = new CollegeLecturer("Beans", 2.39, 8);
        CollegeLecturer p4 = new CollegeLecturer("Tv", 30.00, 3);
        Scanner user_input = new Scanner(System.in);
        Custumer cc = new Custumer();
        List<CollegeProduct> b = new ArrayList<>();
        List<CollegeProduct> market = new ArrayList<>();
        //
    
        market.add(p);
        market.add(p1);
        market.add(p2);
        market.add(p3);
        market.add(p4);
        System.out.print("Please enter with your name: ");
        cc.setName(user_input.next()); 
        System.out.println("How much money you have ? ");
        cc.setMoney(user_input.nextDouble());
        System.out.println("How much do you want to spend per product? ");
        cc.setSpellMoney(user_input.nextDouble());
        int num;
            System.out.print("Enter with the number of desired");
            System.out.print("\n 1 : Search a product");
            System.out.print("\n 2 : Liste de Products");
            System.out.print("\n 3 : exit");
            num = user_input.nextInt();
  
        switch (num) {
            case 1:
             
                String search;
                System.out.print("name of the product");
                search = user_input.next();
                b.addAll(p4.searchProduct(market, search, cc.getSpellMoney()));
                
                String still;
            do {  System.out.println("Do you want to buy anything else? with Yes = 1 or Not = 2");
                        still = user_input.next();
                        if (still.toUpperCase().equals("Y")) {
                            System.out.print("name of the product");
                            search = user_input.next();                          
                          b.addAll (p4.searchProduct(market, search, cc.getSpellMoney()));
                       
                        }
            }
            while(still.toUpperCase().equals("Y") );
                Collections.sort(b, new SortToNameProd());
           
            for(CollegeProduct dp: b) {
                cc.setTotal(cc.getTotal() + dp.price);
        }    
               if(cc.getTotal() < cc.getMoney()){
                   System.out.println("purchase made successfully");
                    System.out.println("Products Bought: ");
                   for(CollegeProduct dp: b){
                       System.out.print(dp.product + " ");
                   }
               }else{
                   System.out.println("You do not have enough money to buy these products");
               }break;
            case 2:
                for (CollegeProduct pro : market) {
                    System.out.println(pro);

                } break;
            case 3:    
                System.exit(0);
        }
       
    }
   
}
