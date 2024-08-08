package AssignmentOne;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        PERSON CLASS OBJECTS.
//        Person p1 = new Person("Honey", 24);
//        Person p2 = new Person("Ankush", 22);
//        p1.showDetails();
//        p2.showDetails();


//        PERSON CLASS OBJECTS.
//        Dog d1 = new Dog("Mark", "German Shaperd");
//        d1.dogInfo();
//        d1.setName("Dhruv");
//        d1.dogInfo();


//        RECTANGLE CLASS OBJECTS.
//        Rectangle r1 = new Rectangle(5, 3);
//        double area = r1.area();
//        System.out.println(area);
//
//        double perimeter = r1.perimeter();
//        System.out.println(perimeter);


//        CIRCLE CLASS OBJECT.
//        Circle c1 = new Circle(4);
//        double a =c1.area();
//        double c =c1.circumference();
//        c1.getRadius();
//        System.out.println(a);
//        System.out.println(c);


//        BOOK CLASS OBJECT
//        Book b1 = new Book("Rich dad Poor dad", "Robert T. Kiyosaki", "101A");
//        Book b2 = new Book("48 Laws of Power", "Robert Green" , "102A");
//        Book b3 = new Book("Ikigai", "Francesc Miralles" , "103A");
//
//        ArrayList<Book> booksList = new ArrayList<>();
//        booksList.add(b1);
//        booksList.add(b2);
//        booksList.add(b3);
// Library class object
//        Library l1 = new Library(booksList);
//        l1.showAllBooks();
//        l1.removeBook("101A");
//        l1.showAllBooks();
//        l1.addBook(new Book("Data Structure and Algorithms", "Narasimha Karumanchi", "104B"));
//        l1.showAllBooks();


//        Employee class object.
//        Employee e1 = new Employee("rakesh", "web dev", 35000.0);
//        System.out.println(e1);
//        e1.updateSalary(10.0);
//        System.out.println(e1);


//        Account class object.
//        Account a1 = new Account(101, "honey", "12345");
//        Account a2 = new Account(102, "danish", "1212");
//        a1.deposite(12000.0);
//        a2.deposite(3000.0);
//
//ArrayList<Account> accountsList = new ArrayList<>();
//accountsList.add(a1);
//accountsList.add(a2);
//        Bank b1 = new Bank(accountsList);
//        a1.deposite(2040.0);
//        a2.deposite(4328.0);
//        a1.withdraw("12345", 300.0);
//        a2.withdraw("1214", 2000.0);
//        b1.showAllAccounts();


//        TrafficLight class object.
//        TrafficLight t1 = new TrafficLight("red",1);
//        t1.checkColor();
//        t1.changeColorTo("yellow");
//        t1.checkColor();
//        t1.changeColorTo("green");
//        t1.checkColor();

//        Student class object.
//        Student s1 = new Student(23, "rakesh", "rakesha@mail.com", "b.tech", 20000.0);
//        s1.showDetails();


//         saving account
//        SavingAccount sa1 = new SavingAccount(1003, "hd", 2.5F, "12345");
//        sa1.deposite(1000.0);
//        System.out.println(sa1.total_balance);
//        sa1.applyInterest(1);
//        System.out.println(sa1.total_balance);



//         Gym
//        GymMembership g1 = new GymMembership("rohan", "normal");
//
//        System.out.println(g1.payableFees(3));
//
//        PremiumGymMembership pg1 = new PremiumGymMembership("rahul", "premium", true, true);
//
//        System.out.println(pg1.payableFees(3));


//        Event
        Event e1 = new Event("bday", "meerut", LocalDate.of(2024, 8, 23));
        e1.displayDetails();
        Seminar s1 = new Seminar("java seminar", "delhi", LocalDate.of(2024, 9, 3),5);
        s1.displayDetails();
    }
}
