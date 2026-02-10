package Java;

public class Encapculationbasic {
    public String name;
    private int Id;
    Encapculationbasic (String name, int Id){
        this.name =name;
        this.Id =Id;
    }
    public void setId(int i){
        if(i>0){
            this.Id = i;
        }
        else {
            System.out.println("Invalid Id");
        }
    }
    public int getId(){
        return Id;
    }
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + Id);
    }
    public static void main(String[] args) {
        Encapculationbasic e1 = new Encapculationbasic("Sabed", 101);
        e1.display();
        e1.setId(102);
        System.out.println("Updated Id : " + e1.getId());
}
}
