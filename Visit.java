package discountsystem;
import java.util.*;
/*
This file is a work in progress.
Date: October 1st 2017
Author: @Vithuson
*/
public class Visit {
    Customer customer;
    Date date;
    private double serviceExpense = 0.0;
    private double productExpense = 0.0;
    
   public Visit(String name, Date date){
        date = this.date;
        name = customer.getName();
    }
   
    public String getName(){
        return customer.getName();
    }
    
    public double getServiceExpence(){
        return serviceExpense;
    }
      
    public void setServiceExpence(double ex){
        ex = serviceExpense;
    }
    
    public double getProductExpence(){
        return productExpense;
    }
    
    public void setProductExpence(double ex){
        ex = productExpense;
    }
    
    public double getTotalExpence(){
        double total;
        total = this.productExpense + this.serviceExpense;
        return total;
    }
    
    public String toString(){
        //TO DO
        return null;
    }
}
