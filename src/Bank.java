package src;

import java.util.Scanner;

public class Bank {
    public static void main(String args[]) {
        // create new instance of bank class
        Bank bank = new Bank();

        // calling run method in bank class;
        bank.run();
    }

    public void run() {
        System.out.println("Welcome to the bank. Please Enter your name Here: ");

        /*
         * created the scanner to get user input
         */
        Scanner scanner = new Scanner(System.in);

        // get customer name and store it in the variable name;
        String name = scanner.next();

        System.out.println("hello " + name + " we are creating checking and saving account for you.");

        // create customer with given name;
        Customer customer = new Customer(name);

        // taking the customer address;
        System.out.println("Please Enter your address: ");

        // taking the customer's address and store it in the variable address;
        String address = scanner.next();

        // set customer's with given address
        customer.setAddress(address);

        // create a new checking Account for the new customer;
        BankAccount checkingAccount = new BankAccount("checking", customer);

        // new saving account for new customer;
        BankAccount savingsAccount = new BankAccount("savings", customer);

        // gets and prints the customer's information
        System.out.println();
        System.out.println("Customer's Info: ");
        System.out.println(checkingAccount.getCustomerInfo());

        // get and prints the info for checking account;
        System.out.println("Checking Account: ");
        System.out.println(checkingAccount.getaccountInfo());
        // get and prints the info for saving account;
        System.out.println("savings Account: ");
        System.out.println(savingsAccount.getaccountInfo());

        // deposits
        System.out.println();
        System.out.println("Amount (decimal) to deposit into your checking Account");

        // gets the amount
        double amount = scanner.nextDouble();


        checkingAccount.deposit(amount);//to deposite in the account;


        // savings
        System.out.println();
        System.out.println("Amount (decimal) to deposit into your savings Account");

        // gets the amount
        amount = scanner.nextDouble();
        savingsAccount.deposit(amount);

        //prints the new balances;
        System.out.println(checkingAccount.getaccountInfo());
        System.out.println(savingsAccount.getaccountInfo());
        

        //withdraw 
        System.out.println();
        System.out.println("Enter your amount to withdraw from your checking account");
        amount = scanner.nextDouble();

        //from checking account
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            // e.printStackTrace();

            //get error message from withdraw method
            System.out.println(e.getMessage());
        }

        //from savings account
        try {
            savingsAccount.withdraw(amount);//withdrew from savings account;
        } catch (Exception e) {
            // e.printStackTrace();

            //get error message from withdraw method
            System.out.println(e.getMessage());
        }


        //prints new balance;
        System.out.println(checkingAccount.getaccountInfo());
        System.out.println(savingsAccount.getaccountInfo());

        scanner.close();
    }
}