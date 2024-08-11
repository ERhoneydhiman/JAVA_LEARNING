package AssignmentOne;

public class ElectronicsProduct {
//    24. Write a Java program to create a class called "ElectronicsProduct" with
//    attributes for product ID, name, and price. Implement methods to apply a
//    discount and calculate the final price. Create a subclass " WashingMachine"
//    that adds a warranty period attribute and a method to extend the warranty.

    String productID;
    String name;
    Double price;

    public ElectronicsProduct(String productID, String name, Double price){
        this.name = name;
        this.productID = productID;
        this.price = price;
    }


    public Double applyDiscount(Integer discount){
       this.price = price - (price * (discount/100.0));
        return price ;
    }
}
