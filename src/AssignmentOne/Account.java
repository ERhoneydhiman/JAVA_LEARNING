package AssignmentOne;

public class Account {
//    20. Write a Java program to create a class called "BankAccount" with
//    attributes for account number, account holder's name, and balance. Include
//    methods for depositing and withdrawing money, as well as checking the
//    balance. Create a subclass called "SavingsAccount" that adds an interest rate
//    attribute and a method to apply interest.



    private final long acc_no;
    private final String acc_owner;
    protected double total_balance = 0;
    private String PINCODE;

    public Account( long accNo, String accOwner, String pincode){
        this.acc_no = accNo;
        this.acc_owner = accOwner;
        this.PINCODE = pincode;
    }

    public long getAccNo() {
        return acc_no;
    }

    public String getAccOwner() {
        return acc_owner;
    }

    public double getTotalBalance() {
        return total_balance;
    }

    public boolean checkPIN(String pincode) {
        return this.PINCODE.equals(pincode);
    }

    public void deposite(double amount){
        try{
            this.total_balance = total_balance + amount;
            System.out.println("Amount Added.\n"+ total_balance+ " is total balance.");
        }catch (Exception ex){
            System.out.println("Wrong PIN CODE !!! try again");
        }finally {
            System.out.println("Transaction ended.");
        }

    }
    public double withdraw(String PINCODE, double amount){

        try{
            if (checkPIN(PINCODE)){
                total_balance = total_balance - amount;
                System.out.println("Amount Added.\n"+total_balance+ " is total balance.");
            }else {
                System.out.println("Wrong PIN CODE!!");
            }
        }catch (Exception ex){
            System.out.println("Pin Code is wrong. or set Pin Code First");
        }finally {
            System.out.println("Transaction ended.");
        }
        return amount;
    }

    @Override
    public String toString(){
        return "Acc no : "+acc_no+"\nAcc Owner : "+acc_owner+"\nTotal Balance: "+total_balance;
    }
}
