package Java;

import java.io.File;

public class Book {
    public String tittle;
    public double price;
    Book(String tittle, double price){
        this.tittle = tittle;
        this.price = price;
    }
    void display(){
        System.out.println("Tittle: " + tittle);
        System.out.println("Price: " + price);
    }
}
class Ebook extends Book{
    public double  Fileseize;
    Ebook(String tittle, double price, double Filesize){
        super(tittle, price);
        this.Fileseize = Filesize;
    }
    double billcount(){
        return price + Fileseize * 1.5;
    }
}
class printbook extends Book{
    public double  pagecount;
    printbook(String tittle, double price, double pagecount){
        super(tittle, price);
        this.pagecount = pagecount;
    }
    double pricecell(){
        return price + pagecount * 2;
    }
}
class main{
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Java Programming", 29.99, 5.0);
        ebook.display();
        System.out.println("Total Price: " + ebook.billcount());
        printbook printbook = new printbook("Java Programming", 29.99, 300);
        printbook.display();
        System.out.println("Total Price: " + printbook.pricecell());
    }
}
