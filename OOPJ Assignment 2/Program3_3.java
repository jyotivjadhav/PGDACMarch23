import java.util.Scanner;
class Book{
    Scanner sc=new Scanner(System.in);
    Program3_3 p = new Program3_3();
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
    Book(){
        this.title = "None";
        this.author = "None";
        this.publisher = "None";
        this.isbn = "None";
        this.year = 0;
        this.price = 0.00;
        this.quantity = 0;
    }
    Book(String title, String author, String publisher, String isbn, int year, double price, int quantity){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }
    public void increaseQuantity(int quantity ){
        System.out.println("Enter quantity to increase");
        int Increase=sc.nextInt();
        int IncreaseQuantity=Increase+this.quantity;
        System.out.println("Book quantity increase by:"+Increase);
        setQuantity(IncreaseQuantity);

    }
    public void decreaseQuantity(int quantity){
        System.out.println("Enter quantity to decrease");
        int decrease=sc.nextInt();
        int decreaseeQuantity=his.quantity-decrease;
        System.out.println("Book quantity increase by:"+decrease);
        setQuantity(decreaseeQuantity);

    }
    public void getInventoryValue(int quantity,double Price){
        double total=getPrice()*getQuantity();
        System.out.println("Book Overall Detail:");
        System.out.println("=================================================");
        System.out.println("Book Quantity:"+getQuantity());
        System.out.println("Total Price: "+getPrice());
        System.out.println("Total Inventory is:"+total);
        System.out.println("=================================================");
    }
    // setter
    public void setTitle(String Title) {
        this.title = Title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // getter
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author ;
    }
    public String getPublisher() {
        return this.publisher ;
    }
    public String getIsbn() {
       return this.isbn;
    }
    public double getPrice() {
       return this.price ;
    }
    public int getQuantity() {
       return this.quantity ;
    }
    public int getYear() {
       return this.year ;
    }
}
class Program3_3{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        System.out.println("Enter Title");
        b.setTitle(sc.nextLine());
        System.out.println("Enter Author");
        b.setAuthor(sc.nextLine());
        System.out.println("Enter Publisher");
        b.setPublisher(sc.nextLine());
        System.out.println("Enter Isbn");
        b.setIsbn(sc.nextLine());
        System.out.println("Enter Year");
        b.setYear(sc.nextInt());
        System.out.println("Enter Quantity");
        b.setQuantity(sc.nextInt());
        System.out.println("Enter Price");
        b.setPrice(sc.nextDouble());
       
        // b.getTitle();
        // b.getAuthor();
        // b.getPublisher();
        // b.getIsbn();
        // b.getYear();
        // b.getPrice();
        // b.getQuantity();
        b.increaseQuantity(b.getQuantity());
        System.out.println("current + quantity"+b.getQuantity());
        b.decreaseQuantity(b.getQuantity());
        System.out.println("current - quantity"+b.getQuantity());
        b.getInventoryValue(b.getQuantity(),b.getPrice());
        System.out.println("current inventory"+b.getQuantity()+b.getPrice());

    }
}