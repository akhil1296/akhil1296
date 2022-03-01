public interface WaitingCustomer {
    public abstract void orderReady(String preparedDrink);
    public String getName();
    public String getDrinkOrdered();
}
