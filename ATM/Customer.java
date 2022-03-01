public class Customer {
    // defining the customer attributes
    private String name;
    private String email;
    private String phone;
    private Address address;

    private Card card;
    private CustomerStatus status;

    public void setCustomerDetails(String name, String email, String phone, Address address, CustomerStatus status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public void setCardDetails(Card card){
        this.card = card;
    }

    public Card getCard(){
        return card;
    }

    public CustomerStatus getCustomerStatus(){
        return status;
    }

    public Address getAddress(){
        return address;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean makeTransaction(Screen screen, Account account, TransactionType T){
        if(T.equals(TransactionType.BALANCE_ENQUIRY)){
            String message = "Currently, your balance is : " + account.getTotalBalance();
            screen.showMessage(message);
            return true;
        }
        return false ;
    }

    public boolean makeTransaction(Screen screen, CashDispenser cashDispenser, SavingsAccount account, double amount, TransactionType T){
        if(T.equals(TransactionType.WITHDRAW)){
            double limit = account.getWithdrawLimit();
            if(amount > limit){
                String message = "Amount is beyond the withdraw limit. Please increase your withdraw limit, or enter the less amount in the next transaction. Thank You !! ";
                screen.showMessage(message);
                return false;
            }
            else{
                 return cashDispenser.dispenseCash(screen, amount);
            }
        }
        return false ;
    }

}
