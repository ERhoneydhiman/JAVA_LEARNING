package AssignmentOne;

import java.util.ArrayList;

public class Bank {
//    7. Write a Java program to create a class called "Bank" with a collection of
//    accounts and methods to add and remove accounts, and to deposit and
//    withdraw money. Also define a class called "Account" to maintain account
//    details of a particular customer.

    ArrayList<Account> accounts = new ArrayList<>();
    public Bank(ArrayList<Account> account){
        this.accounts = account;
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account Added.");
    }

    public void removeAccount(long accNo, String PINCODE){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNo() == accNo && accounts.get(i).checkPIN(PINCODE)){
                accounts.remove(i);
                System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
                System.out.println(accounts.get(i).getAccOwner() + "'s Account is removed.");
                System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
            }
        }
    }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No Account in this Bank.");
            return;
        }
        for (Account account : accounts) {
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println(account);
        }
    }
}
