package AssignmentOne;

public class Building {
//    25. Write a Java program to create a class called "Building" with attributes for
//    address, number of floors, and total area. Create subclasses
//    "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like
//    number of apartments for residential and office space for commercial
//    buildings. Implement a method to calculate the total rent for each subclass.
    String address;
    Integer no_of_floors;
    Double total_area;

    public Building(String address, Integer no_of_floors, Double total_area){
        this.address = address;
        this.no_of_floors = no_of_floors;
        this.total_area = total_area;
    }



}
