package OOPS;

public class Address {
    String city;
    String state;
    String country;
    int zip_code;

    public Address(String city, String state, String country, int zip_code){
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip_code = zip_code;
    }

//    @Override
    public String toString() {
        return "Address  :" +city +  "\t, "+state +  "\t, "+country +  "\t, "+zip_code;
    }
}
