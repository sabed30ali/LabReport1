package Java;

public class Student {
    public String name;
    public int id;
    public static int count = 0; // static variable to keep track of the number of students

    public Student (String name, int id){
        this.name = name;
        this.id = id;
        count++; // increment the count whenever a new student is created
    }
    void display(){
        System.out.println("Name: " + name + ", ID: " + id);
    }
    public static void main(String[] args) {
        Student sujon = new Student("Sujon", 101);
        Student sabed = new Student("Sabed", 102);
        Student ifty = new Student("Ifty", 103);
        sujon.display();
        sabed.display();
        ifty.display();
        System.out.println("Total number of students: " + Student.count); // accessing the static variable using the class name
    }
}
