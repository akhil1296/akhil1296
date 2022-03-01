public class Account {
    private String userName;
    private String password;
    private AccounStatus accountStatus;

    public Account(String userName, String password, AccounStatus status) {
        this.userName = userName;
        this.password = password;
        this.accountStatus = status;
    }

    public String getUserName() {
        return userName;
    }

    public AccounStatus getAccountStatus() {
        return accountStatus;
    }

    public String getPassword() {
        return password;
    }

    public boolean resetPassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            return true;
        }
        return false;
    }
}