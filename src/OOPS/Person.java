package OOPS;

public class Person {
    private final int id ;
    private final String name;
    private final Address  address;
    private final String contact;

    public Person(int id, String name, Address address, String contact){
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
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
    public String getContact(){
        return contact;
    }

    public void displayAll(){
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println(address);
        System.out.println("CONTACT on: "+ contact);
    }
}
