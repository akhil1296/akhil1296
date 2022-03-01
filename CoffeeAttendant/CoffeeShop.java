public class CoffeeShop{
    public static void main(String args[]){
        CoffeeAttendant attendant = new CoffeeAttendant();
        
        Customer john = new Customer("John", "Mojhito");
        Customer remo = new Customer("Remo", "Mojhito lemon");

        attendant.takeOrder(john);
        attendant.takeOrder(remo);

        attendant.prepareDrink(john.getDrinkOrdered());
        attendant.prepareDrink(remo.getDrinkOrdered());

        attendant.completeCallOutOrders();
    }
}




























// 3 actors 
//     - cofee managemant system - that can add and remove the attendants
//     - coffee attendant (list of attendants)
//         attributes - name, id, email, address
//         behaviours - take the orders , announce the order , prepare the order
//     - customer (list of customers) 
//         behaviours - give the orders, get the order, waiting 
//         attributes - order no., billAmount