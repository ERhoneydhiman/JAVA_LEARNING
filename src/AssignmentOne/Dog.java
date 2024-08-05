package AssignmentOne;

public class Dog extends Pet {
//    2. Write a Java program to create a class called "Dog" with a name and breed
//    attribute. Create two instances of the "Dog" class, set their attributes using the
//    constructor and modify the attributes using the setter methods and print the
//    updated values.
//    with que 29.

    String fav_toy;

    public Dog(String name, String species, float age, String fav_toy){
        super(name, species, age);
        this.fav_toy = fav_toy;
    }



//    public void dogInfo(){
//        System.out.println("Name of Dog is "+name);
//    }
    @Override
    public String toString(){
        return "Pet is Dog \nPet Name is "+name+"\n Pet species is "+species+"\npet age is"+age+"\nFav toy is"+fav_toy;
    }

}
