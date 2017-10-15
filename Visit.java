package discountsystems;
//imports
import java.util.Date;

public class Visit extends Customer{
   
    private Customer customer;
    private Date date;
    private double serviceExpense = 0.0;
    private double productExpense = 0.0;
    
    Visit(String name, Date date){
       super(name);
       this.date = date;
      
    }
    
    @Override
    public String getName(){
       return super.getName();
    }
    
    public double getServiceExpense(){
        return this.serviceExpense;
    }
    
    public double getProductExpense(){
        return this.productExpense;
    }
    
    public double getTotalExpense(){     
        double total;
        if(isMember()) {
            String _memberType = getMemberType();
            double _productDiscount = DiscountRate.getProductDiscountRate(_memberType);           
            double _serviceDiscount = DiscountRate.getServiceDiscountRate(_memberType);
            total = (this.serviceExpense - (this.serviceExpense * _serviceDiscount)) + (this.productExpense - (this.productExpense * _productDiscount));
        }
        else 
            total = this.serviceExpense + this.productExpense;        
        return total;
    }
    
    public void setServiceExpense(double expense){
        this.serviceExpense = expense;
    }
    
    public void setProductExpense(double expense){
        this.productExpense = expense;
    }
    
    public String toString(){
        return "Name: "+getName()+"\nDate: "+date+"\nMember Type: "+getMemberType()
                +"\nService Expense: $"+serviceExpense+"\nProduct Expense: $"+productExpense+"\nService Discount: "
                +DiscountRate.getServiceDiscountRate(getMemberType()) * 100+"%\nProduct Discount: "
                +DiscountRate.getProductDiscountRate(getMemberType()) * 100+"%\nTotal: $"+getTotalExpense()
                +"\n-----------------------+";
    }
}
