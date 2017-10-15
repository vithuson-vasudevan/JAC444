package discountsystems;

public class DiscountRate {
    
    private final static double serviceDiscountPremium = 0.2;
    private final static double serviceDiscountGold = 0.15;
    private final static double serviceDiscountSilver = 0.1;
    private final static double productDiscountPremium = 0.1;
    private final static double productDiscountGold = 0.1;
    private final static double productDiscountSilver = 0.1;
    
    public static double getServiceDiscountRate(String type){
        if(type.equals("Premium")){ 
            return serviceDiscountPremium;
        }
        else if(type.equals("Gold")) {
            return serviceDiscountGold;
            } 
        else if(type.equals("Silver")){
            return serviceDiscountSilver;
        }
        else 
            return 0.0;
    }
    
    public static double getProductDiscountRate(String type){
        if(type.equals("Premium")){
            return productDiscountPremium;
        }
        else if(type.equals("Gold")){
            return productDiscountGold;
        }
        else if(type.equals("Silver")){
            return productDiscountSilver;
        }
        else 
            return 0.0;
    }
}
