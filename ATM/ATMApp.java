public class ATMApp {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        // Setting up the initial things

        // 1. Set the bank
        Bank bank = new Bank("SBI", "SBIN0000145");
        // 2. set the ATM Address
        Address atmAddress = new Address("EC", "Banagalore", "Karanataka", "India", "501000");
        // 3. setting up the atm

        ATM atm1 = new ATM(001, atmAddress, 10000000); // atmcode, atmaddress, amount in atm

        // 4. Setting up the user details
        int PIN = 1789; // we can add it in the constant class
        Screen screen = atm1.getScreen();

        Customer customer = new Customer();
        customer.setCustomerDetails("Akhilesh Gautam", "gautamakhilesh12@gmail.com", "8765040831",
                new Address("World Bank", "Kanpur", "U.P.", "India", "208027"), CustomerStatus.ACTIVE);
        Address customerAddress = customer.getAddress();

        SavingsAccount account = new SavingsAccount(898749, 100000.34, customerAddress);
        account.setWithdrawLimit(25000);

        CurrentAccount account2 = new CurrentAccount(898749, 3223.34, customerAddress);
        account2.setWithdrawLimit(15000);

        // 5. User has entered the card, and through scanner, it has read the following
        // details
        customer.setCardDetails(new Card("Akhilesh Gautam", "987612346587", PIN, "12/34", atmAddress));
        Card cardDetails = customer.getCard();

        // 6. User enters the pin using the keypad

        Keypad dialpad = atm1.getKeypad();
        dialpad.setInput(1789);

        boolean isAuthenticated = atm1.isUserAuthenticated(PIN, dialpad.getInput());
        String message = "Your transaction has been successful. Please collect your card." ;
        boolean isTransactionSuccessful = false ;

        if (!isAuthenticated) {
            isTransactionSuccessful = screen.showMessage(message);
            return;
        }

        // 7. Now the user is authenticated, and user will choose the option from the
        // screen
        System.out.println("User has authenticated successfully with PIN : " + dialpad.getInput());
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        Screen s1 = atm1.getScreen();
        s1.displayOptions();

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        // 8. Now user will pick the suitable transaction
        isTransactionSuccessful = customer.makeTransaction(screen, account, TransactionType.BALANCE_ENQUIRY);
        System.out.println("Transaction successful : " + isTransactionSuccessful);

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        double amountToBeWithdrawn = 3200 ;
        isTransactionSuccessful = customer.makeTransaction(screen, atm1.getCashDispenser(), account, amountToBeWithdrawn ,TransactionType.WITHDRAW);
        System.out.println("Transaction successful : " + isTransactionSuccessful);

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        
        // 9. Show message on the screen
        message = "Your transaction has been successful. Please collect your card." ;
        isTransactionSuccessful = screen.showMessage(message);

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        // 10. Now Print the receipt
        Printer printer = atm1.getPrinter();
        isTransactionSuccessful = printer.printReceipt(customer, cardDetails.getBillingAddress(), amountToBeWithdrawn);
        
        System.out.println("----------------------------------------------");
        System.out.println();

        message = "Receipt printed Successfully" ;
        isTransactionSuccessful = screen.showMessage(message);

        // boolean isTransaction = atm1.getCashDispenser().dispenseCash(3200); // for
        // doing the transaction
        // set customer details

        // System.out.println(account2.getWithdrawLimit());

        // System.out.println(dialpad.getInput());
        // System.out.println(atm1.getBalanceAvailable());
        // System.out.println(account.getWithdrawLimit());
        // System.out.println(account.getTotalBalance());
        // System.out.println(cardDetails.getBillingAddress().getStreetName());
        // System.out.println(customer.getCustomerStatus());
    }
}