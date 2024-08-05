package AssignmentOne;

public class PremiumGymMembership extends GymMembership {
    boolean personal_trainer;
    boolean spa_access;
//    protected int ONEMONTHFEES = 1500;

    public PremiumGymMembership(String name, String member_type, boolean personal_trainer, boolean spa_access) {
        super(name, member_type);
        this.personal_trainer = personal_trainer;
        this.spa_access = spa_access;
    }
    @Override
    public double payableFees(int months){
        return months * (ONEMONTHFEES+500);
    }
}
