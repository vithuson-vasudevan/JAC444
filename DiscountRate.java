package discountsystem;
/*
This file is a work in progress.
Date: October 1st 2017
Author: @Vithuson
*/
public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;
    
    public static double getServiceDiscountRate(String type){
        if(type == "Premium")
            return serviceDiscountPremium;
        else 
            if(type == "Gold")
                return serviceDiscountGold;
        else
            if(type == "Silver")
                return serviceDiscountSilver;
        else
            return 0;
    }
    
    public static double getProductDiscountRate(String type){
        if(type == "Premium")
            return productDiscountPremium;
        else
            if(type == "Gold")
                return productDiscountGold;
        else
            if(type == "Silver")
                return productDiscountSilver;
        else
            return 0;
    }
}