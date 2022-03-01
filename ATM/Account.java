public class Account {
    private int accountNumber;
    private double totalBalance;
    private Address billingAddress;

    public Account(int accountNumber, double totalBalance, Address billingAddress){
        this.accountNumber = accountNumber ;
        this.totalBalance = totalBalance ;
        this.billingAddress = billingAddress;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getTotalBalance(){
        return totalBalance;
    }
    public Address getBillingAddress(){
        return billingAddress;
    }

}
