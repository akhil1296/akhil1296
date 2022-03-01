import java.util.*;

public class CustomerTransaction implements Accounting, Reporting {
    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    public String getName() {
        return "name";
    }

    public Date getDate() {
        return new Date();
    }

    public String productBreakdown() {
        String reportList = null;
        for (Product product : products) {
            reportList += product.getProductName();
        }
        return reportList;
    }

    public void prepareInvoice() {
        System.out.println("Invoice Prepared...");
    }

    public void chargeCustomer() {
        System.out.println("Charges the customer...");
    }
}