package AssignmentOne;

public class Pet {
//    29. Write a Java program to create a class called "Pet" with attributes for
//    name, species, and age. Create subclasses "Dog" and "Bird" that add specific
//    attributes like favourite toy for dogs and wing span for birds. Implement
//    methods to display pet details and calculate the pet's age in human years

    String name;
    String species;
    float age;

    public Pet(String name, String species, float age){
        this.name = name;
        this.age = age;
        this.species = species;
    }
    @Override
    public String toString(){
        return "Pet Name is "+name+"\n Pet species is "+species+"\npet age is"+age;
    }
}
