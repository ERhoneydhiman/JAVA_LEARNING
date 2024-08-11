package AssignmentOne;

public class WashingMachine extends ElectronicsProduct{

    Integer warranty;
    public WashingMachine(String productID, String name, Double price, Integer warranty) {
        super(productID, name, price);
        this.warranty = warranty;
    }

    public Integer extendWarranty(Integer extendedYears){
        this.price = price + extendedYears*100;
        this.warranty = warranty + extendedYears;
        return warranty;
    }

}
