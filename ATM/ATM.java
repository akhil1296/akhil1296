public class ATM {
    private int atmId ;
    private Address address ;
    private double balanceAvailable ;
    private CashDispenser cashDispenser ;
    private Keypad keypad;
    private Printer printer;
    private Screen screen;

    public ATM(int id, Address address, double balance){
        this.atmId = id ;
        this.address = address;
        this.balanceAvailable = balance;
        keypad = new Keypad();
        printer = new Printer();
        screen = new Screen();
        cashDispenser = new CashDispenser(balanceAvailable, 10000, 2000);
    }
    public Keypad getKeypad(){
        return keypad;
    }
    public Printer getPrinter(){
        return printer;
    }
    public CashDispenser getCashDispenser(){
        return cashDispenser;
    }
    public Screen getScreen(){
        return screen;
    }
    public int getATMId(){
        return atmId;
    }
    public Address getAddress(){
        return address;
    }
    public double getBalanceAvailable(){
        return balanceAvailable;
    }
    
    // private ChequeDeposit chequeDeposit;
    // private CashDeposit cashDeposit;

    public boolean isUserAuthenticated(int alreadyPIN, int enteredPIN){
        return alreadyPIN == enteredPIN ? true : false ;
    }
    // public boolean makeTransaction(){

    // }

}
