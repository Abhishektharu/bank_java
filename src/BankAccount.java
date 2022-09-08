package src;

public class BankAccount {
    /*
     * types of account (checking/saving)
     */
    String accountType;

    double balance;
    /*
     * customer for this account;
     */
    Customer customer;

    // public BankAccount
    // constructor

    public BankAccount(String accoutType, Customer customer) {
        this.accountType = accoutType;
        this.customer = customer;
    }

    // methods
    public void deposit(double amount) {
        this.balance += amount ;

    }

    /*
     * withdraw the given amount from the account
     * if entered amount is greater than available amount then it shows the
     * exception
     */
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("The amount is greater than available balance");

        }
        this.balance -= amount;

    }

    /*
     * returns account type balance for this account;
     * return account info
     */
    public String getaccountInfo() {
        return this.accountType + ": " + this.balance;
    }
    
    /*
     * returns the customer name and address
     */
    public String getCustomerInfo(){
        return this.customer.getName() + ":" + this.customer.getAddress();
    }

    
}
