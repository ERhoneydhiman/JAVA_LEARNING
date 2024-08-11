package AssignmentOne;

public class CommercialBuilding extends Building{
    Integer officeSpace;

    public CommercialBuilding(String address, Integer no_of_floors, Double total_area, Integer officeSpace) {
        super(address, no_of_floors, total_area);
        this.officeSpace = officeSpace;
    }
    public Double rent(Double pricePerOffice, Integer officeCount){
        return pricePerOffice * officeCount;
    }
}
