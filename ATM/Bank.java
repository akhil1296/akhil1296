public class Bank {
    private String bankName;
    private String bankCode;

    public Bank(String name, String code) {
        this.bankName = name;
        this.bankCode = code;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    // public boolean addATM() {

    // }
}
