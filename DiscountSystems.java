package discountsystems;
import java.util.Date;

public class DiscountSystems {

    public static void main(String[] args) {
        //date object to create todays date
        Date today = new Date();
        Visit person;
        //Array of Strings to populate objects
        String[] names = {"Brad Challigan", "Shelly Sherbourne", "Java Vermont", "Priya Rakhra"};
        String[] types = {"Premium", "Gold", "Silver", ""};
        double[] prodExpense = {250, 600, 20, 7000};
        double[] servExpense = {1700, 50, 420, 10};
        
        for(int i = 0; i < 4; i++){
            person = new Visit(names[i], today);
            person.setMemberType(types[i]);
            person.setProductExpense(prodExpense[i]);
            person.setServiceExpense(servExpense[i]);
            System.out.println(person);
        }
        
      /*  String name = "Brad Chilligan";
        String type = "Premium";
        Visit brad = new Visit(name, today);
        
        brad.setMemberType(type);
        brad.setProductExpense(20);
        brad.setServiceExpense(350);
        
        //Shelly
        String _name = "Shelly Sherbourne";
        String _type = "Gold";
        Visit shelly = new Visit(name, today);
               
        System.out.println(brad);
        
        */
        
        
    }   
    
}
