package Java;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class upcasitng {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();
        // a.bark(); ❌ Not allowed
        Dog d = (Dog) a;  // Downcasting
        d.bark();  // Now we can call bark()
    }
}