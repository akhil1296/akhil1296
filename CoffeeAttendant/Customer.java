public class Customer implements WaitingCustomer{
    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public String getName() {
        return name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }


    @Override
    public void orderReady(String preparedDrink) {
        if(drinkOrdered.equals(preparedDrink)){
            exitStore();
        }   
    }

    private void exitStore(){
        System.out.println(name + " : Thank you, I have received my " + drinkOrdered + ". I am leaving the shop now. ");
    }
    
}
