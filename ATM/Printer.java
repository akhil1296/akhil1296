public class Printer {
    public boolean printReceipt(Customer customer, Address address, double amount) {

        System.out.println("Billing address details : ");
        System.out.println("-----------------------");
        System.out.println();

        System.out.println();
        System.out.println("Name : " + customer.getName());
        System.out.println("Email : " + customer.getEmail());
        System.out.println("Amount Withdrawn : " + amount);
        System.out.println();
        System.out.println("StreetName : " + address.getStreetName());
        System.out.println("City : " + address.getCity());
        System.out.println("State : " + address.getState());
        System.out.println("Country : " + address.getCountry());
        System.out.println("PinCode : " + address.getPinCode());
        System.out.println();

        return true;
    }
}
