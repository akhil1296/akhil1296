public class Card {
    private String cardHolderName;
    private String cardNumber;
    private int pin;
    private String expiryDate;
    private Address billingAddress;


    public Card(String cardHolderName, String cardNumber, int pin, String date, Address billingAddress){
        this.cardHolderName = cardHolderName ;
        this.cardNumber = cardNumber;
        this.pin = pin ;
        this.expiryDate = date;
        this.billingAddress = billingAddress ;
    }

    public String getCardHolderName(){
        return cardHolderName;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public int getPin(){
        return pin;
    }
    public String getExpiryDate(){
        return expiryDate;
    }
    public Address getBillingAddress(){
        return billingAddress;
    }
}
