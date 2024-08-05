package AssignmentOne;

public class SavingAccount extends Account {
    float interest_rate;

    public SavingAccount(long accNo, String accOwner, float interest_rate,String pincode){
        super(accNo, accOwner, pincode);
        this.interest_rate = interest_rate;
    }

    public void applyInterest(int years){
        int t = years;
        double si = (total_balance * interest_rate * t)/100;
        total_balance = si + total_balance;
    }
}
