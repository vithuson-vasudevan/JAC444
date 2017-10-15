package discountsystems;

public class Customer {
   
    private String name;
    private boolean member = false;
    private String memberType;
    
    Customer(String name){
        this.name = name;
        this.memberType = null;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getMemberType(){
        return this.memberType;
    }
    
    public void setMemberType(String type){
        if(type.equals("Premium") || type.equals("Gold") || type.equals("Silver")){
            this.memberType = type;
            this.member = true;
        }
        else {
            this.memberType = "None";
            System.out.println("Invalid member type.");
        }
    }
    
    public boolean isMember(){
        return this.member;
    }
    
    public String toString(){
        //this method is left empty because it will not be used
        return null;
    }    
}
