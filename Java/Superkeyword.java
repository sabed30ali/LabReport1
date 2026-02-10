package Java;

public class Superkeyword {
    String name;
    Superkeyword(){
        System.out.println("Superkeyword class constructor called ");
    }
    void show(){
        System.out.println("this is superkeyword class method");
    }
}
class subkeyword extends Superkeyword{
    String name;
    subkeyword(){
        super();
        System.out.println("Subkeyword class constructor called ");
    }
    void display(){
        super.show();
        System.out.println("this is display method");
}
}
