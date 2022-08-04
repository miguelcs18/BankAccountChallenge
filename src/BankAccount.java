public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double quantity){
        this.balance = this.balance + quantity;
        System.out.println("Deposit of " + quantity + "made. Your balance = " + this.balance);
    }

    public void withdrawFunds( double quantity){
        if(this.balance - quantity < 0){
            System.out.println("Can`t make a withdrawal insufficient funds. You only have " + this.balance + " to withdraw " +
                    "");
        }
        else {
            this.balance = balance - quantity;
            System.out.println("Withdrawal of " + quantity + "processed. Remaining balance = " + this.balance);
        }
    }
}
