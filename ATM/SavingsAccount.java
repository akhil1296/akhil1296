public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double totalBalance, Address billingAddress) {
        super(accountNumber, totalBalance, billingAddress);

    }

    private double withdrawLimit;  
    
    public void setWithdrawLimit(double amount){
        this.withdrawLimit = amount ;
    }

    public double getWithdrawLimit(){
        return withdrawLimit;
    }
}
