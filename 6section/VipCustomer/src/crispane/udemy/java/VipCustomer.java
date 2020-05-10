package crispane.udemy.java;
public class VipCustomer {
    String name;
    String email;
    int creditLim;

    public VipCustomer(String name, String email, int creditLim) {
        this.name = name;
        this.email = email;
        this.creditLim = creditLim;
    }

    public VipCustomer() {
        this("default name", "default email", 0);
    }

    public VipCustomer(String name, String email){
        this(name, email, 0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLim() {
        return creditLim;
    }
}
