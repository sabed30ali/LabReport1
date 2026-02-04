package Java;

public class Electricitybill {
    int ConsumerNO;
    String ConsumerName;
    int PreviousMonthsReading;
    int CurrentMonthsReading;
    String  EB_Type;
    double TotalAmount;
    void CalculateBill(){
        int units =CurrentMonthsReading - PreviousMonthsReading;
        if(EB_Type.equalsIgnoreCase("Domestic")){
            if(units <=100){
                TotalAmount = units * 1.0;
            } else if(units <=200){
                TotalAmount = (100 * 1.0) + (units - 100) * 2.5;
            } else if(units <=500){
                TotalAmount = (100 * 1.0) + (100 * 2.5) + (units - 200) * 4.0;
            } else {
                TotalAmount = (100 * 1.0) + (100 * 2.5) + (300 * 4.0) + (units - 500) * 6.0;
            }
            }
        else if(EB_Type.equalsIgnoreCase("Commercial")){
            if(units <=100){
                TotalAmount = units * 2.0;
            } else if(units <=200){
                TotalAmount = (100 * 2.0) + (units - 100) * 4.5;
            } else if(units <=500){
                TotalAmount = (100 * 2.0) + (100 * 4.5) + (units - 200) * 6.0;
            } else {
                TotalAmount = (100 * 2.0) + (100 * 4.5) + (300 * 6.0) + (units - 500) * 7.0;
            }
        }
    }
    void displayBill() {
        System.out.println("Electricity Bill");
        System.out.println("Consumer No: " + ConsumerNO);
        System.out.println("Consumer Name: " + ConsumerName);
        System.out.println("Connection Type: " + EB_Type);
        System.out.println("Total Bill Amount: Rs. " + TotalAmount);
    }
}