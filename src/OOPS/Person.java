package OOPS;

public class Person {
    private int id ;
    private String name;
    private Address address;
    private String contect;

    public Person(int id, String name, Address address, String contect){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contect = contect;
    }



    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public String getContect(){
        return contect;
    }


//    public void setId(int id){
//        this.id = id;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAddress(String address){
//        this.address = address;
//    }
//    public void setContect(String contect){
//        this.contect = contect;
//    }
}
