public abstract class Person{
    private String name;
    private String email;
    private String phone;
    private Address address;
    private Account account;

    public Person(String name, String email, String phone, Address address, Account account) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.account = account;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Account getAccount(){
        return account;
    }

    public Address getAddress(){
        return address;
    }   

    // can set both abstract and direct methods
}
