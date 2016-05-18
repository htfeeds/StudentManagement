package functions;

public class Account {

    private int accountID;
    private String userName;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String DoB;
    private String lastLogin;
    private String permission;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Account() {

    }

    public Account(int accountID, String userName, String password, String fullName, String phoneNumber, String email, String DoB, String lastLogin, String permission) {
        this.accountID = accountID;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.DoB = DoB;
        this.lastLogin = lastLogin;
        this.permission = permission;
    }

    public String getPath() {
        String path = "";
        switch (permission) {
            case "admin":
                path = "src/images/admin.png";
                break;
            default:
                path = "src/images/enrollp.png";
        }
        return path;
    }
}
