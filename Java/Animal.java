package Java;

public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class puppuy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}
class TestInheritance{
    public static void main(String[] args) {
        puppuy p1 =new puppuy();
        p1.weep();
        p1.bark();
        p1.eat();
    }
}