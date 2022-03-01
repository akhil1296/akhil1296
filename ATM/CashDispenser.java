public class CashDispenser {
    private int fiveHundredNote;
    private int twoThousandNote;
    private double totalBalance;

    public CashDispenser(double balance, int five, int two){
        this.totalBalance = balance;
        this.fiveHundredNote = five ;
        this.twoThousandNote = two ;
    }

    public int getFiveHundredNote(){
        return fiveHundredNote;
    }
    public int getTwoThousandNote(){
        return twoThousandNote;
    }

    public boolean dispenseCash(Screen screen, double amount){
        String message = amount + " can not be dispensed. Currently, we do not have enough balance. " ;
        if(canDispenseCash(amount)){
            message =  "Rs. " + amount + " is dispensed. Please collect the cash" ;
            return screen.showMessage(message);   
        }
        return false;
    }

    public boolean canDispenseCash(double amount){
        return amount <= totalBalance ? true : false ;
    }
}   
