public class Screen {
    public void displayOptions(){
        System.out.println("1 : " + TransactionType.BALANCE_ENQUIRY);
        System.out.println("2 : " + TransactionType.WITHDRAW);
        System.out.println("3 : " + TransactionType.DEPOSIT_CASH);
        System.out.println("4 : " + TransactionType.DEPOSIT_CHEQUE);
        System.out.println("5 : " + TransactionType.TRANSFER);
    }
    public boolean showMessage(String message) {
        if (message.length() != 0) {
            System.out.println(message);
            System.out.println();
            return true;
        }
        return false;
    }
    // public TransactionType getInput(){

    // }
}
