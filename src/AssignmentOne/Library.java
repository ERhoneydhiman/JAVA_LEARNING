package AssignmentOne;

import java.util.ArrayList;

public class Library {
//    11. Write a Java program to create a class called "Library" with a collection of
//    books and methods to add and remove books.

   ArrayList<Book> books = new ArrayList<>();
    public Library(ArrayList<Book> book){
        this.books = book;
    }

    public void addBook(Book book){
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println(book.getTitle()+" book added.");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        books.add(book);
    }
    public void removeBook(String  ISBN){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)){
                System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
                System.out.println(books.get(i).getTitle() + " book removed.");
                System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
                books.remove(i);
                return;
            }
        }
        System.out.println("Book not found!!!");
    }
    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println(book);
        }
    }


}
