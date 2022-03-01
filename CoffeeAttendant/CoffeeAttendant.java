import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {
    private List<WaitingCustomer> customerList;
    private List<String> completedDrink;
    
    public CoffeeAttendant(){
        customerList = new ArrayList<WaitingCustomer>();
        completedDrink = new ArrayList<String>();
    }
    public void takeOrder(WaitingCustomer customer){
        customerList.add(customer);
    }
    public void prepareDrink(String drinkToPrepare){
        System.out.println("Preparing the drink : " + drinkToPrepare);
        completedDrink.add(drinkToPrepare) ; 
    }
    public void completeCallOutOrders(){
    for(String readyDrink : completedDrink){
        System.out.println("Order up : " + readyDrink);
        for(WaitingCustomer customer : customerList){
            customer.orderReady(readyDrink);
        }
      }
    }
}