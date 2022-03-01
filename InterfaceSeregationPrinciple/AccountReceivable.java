public class AccountReceivable {
    private Accounting transactionObject;

    public AccountReceivable(Accounting transactionObject) {
        this.transactionObject = transactionObject;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
    }

}
