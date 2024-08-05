package AssignmentOne;

public class Bird extends Pet{

    float wing_span;

    public Bird(String name, String species, float age, float wing_span) {
        super(name, species, age);
        this.wing_span = wing_span;
    }
    @Override
    public String toString(){
        return "Pet is Bird \nPet Name is "+name+"\n Pet species is "+species+"\npet age is"+age+"\nWing span is"+wing_span+"cm";
    }
}
