package Java;

class FamilyMember {
    private String name;
    private int age;
    private String relation;

    public String  getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getRelation(){
    return relation;
    }
    public FamilyMember(){}

    public FamilyMember(String name, int age, String relation){
        this.name = name;
        this.age = age;
        this.relation = relation;
    }
    
    void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Relation: " + relation);
    }

    void displayInfo(String Message){
        System.out.println(Message + " Name: " + name + ", Age: " + age + ", Relation: " + relation);
    }

    boolean isAdult(){
        return age >= 18;
    }
}

interface PersonRole{
    void performRole();
}

interface Responsibilities{
    void takeCare();
    void contribute();
}

class Father extends FamilyMember implements PersonRole, Responsibilities {
    public String occupation;
    public Father(String name, int age, String relation,String occupation){
            super(name, age, relation);
            this.occupation = occupation;
        }
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    public void performRole() {
        System.out.println(getName() + " is performing the role of a father.");
    }
    @Override
    public void takeCare() {
        System.out.println(getName() + " is taking care of the family.");
    }
    @Override
    public void contribute() {
        System.out.println(getName() + " is contributing financially to the family.");
    }
}
class Mother extends FamilyMember implements PersonRole, Responsibilities {
    public String occupation;
    public Mother(String name, int age, String relation,String occupation){
            super(name, age, relation);
            this.occupation = occupation;
        }
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    public void performRole() {
        System.out.println(getName() + " is performing the role of a mother.");
    }
    @Override
    public void takeCare() {
        System.out.println(getName() + " is taking care of the family.");
    }
    @Override
    public void contribute() {
        System.out.println(getName() + " is contributing financially to the family.");
    }
}
class ElderSister extends FamilyMember implements PersonRole, Responsibilities {
    public String Hobby;
    public ElderSister(String name, int age, String relation,String Hobby){
            super(name, age, relation);
            this.Hobby = Hobby;
        }
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    public void performRole() {
        System.out.println(getName() + " is performing the role of an elder sister.");
    }
    @Override
    public void takeCare() {
        System.out.println(getName() + " is taking care of her family.");
    }
    @Override
    public void contribute() {
        System.out.println(getName() + " is contributing to the family by helping with chores.");
    }
}
class Brother extends FamilyMember implements PersonRole, Responsibilities {
    public String occupation;
    public Brother(String name, int age, String relation,String occupation){
            super(name, age, relation);
            this.occupation = occupation;
        }
    @Override 
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    public void performRole() {
        System.out.println(getName() + " is performing the role of a brother.");
    }
    @Override
    public void takeCare() {
        System.out.println(getName() + " is taking care of his Family.");
    }
    @Override
    public void contribute() {
        System.out.println(getName() + " is contributing to the family by helping with chores.");
    }
}
class YoungerBrother extends FamilyMember implements PersonRole, Responsibilities {
    public String occupation,Hobby;
    public YoungerBrother(String name, int age, String relation,String occupation,String Hobby){
            super(name, age, relation);
            this.occupation = occupation;
            this.Hobby = Hobby;
        }
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    public void performRole() {
        System.out.println(getName() + " is performing the role of a younger brother.");
    }
    @Override
    public void takeCare() {
        System.out.println(getName() + " is taking care of his family.");
    }
    @Override
    public void contribute() {
        System.out.println(getName() + " is contributing to the family by helping with chores.");
    }
}
public class Report1081Main {
    static void WhatILearned(){
        System.out.println("\nWhat I Learned in CSE:");
        System.out.println("I learned programming, problem-solving, and OOP concepts like inheritance, encapsulation, polymorphism, abstraction, and interfaces.");
    }
    public static void main(String[] args) {
        Father father = new Father("Mohammad Ali", 60, "Father", "Businessman");
        father.displayInfo();
        father.performRole();
        father.takeCare();
        father.contribute();
        System.out.println("");
        Mother mother = new Mother("Hosne Ara Begum", 45, "Mother", "Housewife");
        mother.displayInfo();
        mother.performRole();
        mother.takeCare();
        mother.contribute();
        System.out.println("");
        ElderSister elderSister = new ElderSister("Sadeka khanam Esha", 28, "Elder Sister", "Reading Books");
        elderSister.displayInfo();
        elderSister.performRole();
        elderSister.takeCare();
        elderSister.contribute();
        System.out.println("");
        Brother brother = new Brother("Mohammad Sabbir Ali", 24, "Elder Brother", "JobHolder");
        brother.displayInfo();
        brother.performRole();
        brother.takeCare();
        brother.contribute();
        System.out.println("");
        YoungerBrother youngerBrother = new YoungerBrother("Mohammad Shafayat Ali",18 , "Younger Brother", "Student", "Football");
        youngerBrother.displayInfo();
        youngerBrother.performRole();
        youngerBrother.takeCare();
        youngerBrother.contribute();
        System.out.println("");
        WhatILearned();

    }
}