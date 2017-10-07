package discountsystem;
import java.util.*;
/*
This file is a work in progress.
Date: October 1st 2017
Author: @Vithuson
*/

public class Customer extends Visit {
    private String name;
    private String memberType;
    private boolean member = false;
    
    
    public Customer(String name){
        name = this.name; 
       // this.memberType = null;
        //this.member = false; 
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMember(){    
        return member;
    }

    public void setMember(boolean member){
        this.member = member;
    }
    
    public String getMemberType(){
        return memberType;
    }
    
    public void setMemberType(String type){
        this.memberType = type;
    }
    
    public String toString(){
        //work in progress
        return null;
    }
}
