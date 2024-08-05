package AssignmentOne;

public class Book {
//    5. Write a Java program to create a class called "Book" with attributes for title,
//    author, and ISBN, and methods to add and remove books from a collection.
    String title ;
    String author;
    String ISBN;

    public Book(String title , String author, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
    @Override
    public String  toString(){
        return "ISBN: "+ISBN+"\n"+ title + "  named book\nwritten by " + author+".";
    }

}
