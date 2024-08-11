package AssignmentOne;

public class ResidentialBuilding extends Building{
    Integer noOfApartment;

    public ResidentialBuilding(String address, Integer no_of_floors, Double total_area, Integer noOfApartment) {
        super(address, no_of_floors, total_area);
        this.noOfApartment = noOfApartment;
    }
    public Double rent(Double pricePerApartment, Integer apartmentCount){
        return pricePerApartment * apartmentCount;
    }
}
