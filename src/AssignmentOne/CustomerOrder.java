package AssignmentOne;

public class CustomerOrder {
//    27. Write a Java program to create a class called "CustomerOrder" with
//    attributes for order ID, customer, and order date. Create a subclass
//    "OnlineOrder" that adds attributes for delivery address and tracking number.
//    Implement methods to calculate delivery time based on the address and
//    update the tracking status.


    long order_ID;
    String customer;
    String order_date;

    public CustomerOrder(long order_ID,String customer,String order_date){
        this.customer = customer;
        this.order_date = order_date;
        this.order_ID = order_ID;
    }
}
