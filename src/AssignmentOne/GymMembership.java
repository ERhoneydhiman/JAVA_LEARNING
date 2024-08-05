package AssignmentOne;

public class GymMembership {
//    30. Write a Java program to create a class called "GymMembership" with
//    attributes for member name, membership type, and duration. Create a
//    subclass "PremiumMembership" that adds attributes for personal trainer
//    availability and spa access. Implement methods to calculate membership fees
//    and check for special offers based on membership type.
    protected int ONEMONTHFEES = 1000;
    protected String name;
    protected String member_type;

    public GymMembership(String name, String member_type){
        this.member_type = member_type;
        this.name = name;
    }

    public double payableFees(int months){
        return months * ONEMONTHFEES;
    }
}
