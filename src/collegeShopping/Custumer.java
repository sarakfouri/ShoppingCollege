/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeShopping;

/**
 *
 * @author Sara
 */
public class Custumer {
    private String name;
    private double money;
    private double spellMoney;
    private double total;
    
    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public double getMoney(){
        return this.money;
    }

    public void setSpellMoney(double spell ){
        this.spellMoney = spell;
    }
    public double getSpellMoney (){
        return this.spellMoney;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public double getTotal(){
        return this.total;
    }

}
