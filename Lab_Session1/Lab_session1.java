class Book {
    String title;
    String author;
    double price;

    
    Book(String title, String author, double price) {
        this.title = title;   
        this.author = author; 
        this.price = price;   
    }

    void displayDetails() {
        System.out.println("Book Title : " + this.title);
        System.out.println("Author     : " + this.author);
        System.out.println("Price      : ₹" + this.price);
    }
}

public class Lab_session1 {
    public static void main(String[] args) {
	
        Book book1 = new Book("Java Fundamentals", "Cay S.Horstmann", 499.20);
        Book book2 = new Book("Data Structures", "Alfred Aho", 599.00);

    
        book1.displayDetails();
        book2.displayDetails();
    }
}
