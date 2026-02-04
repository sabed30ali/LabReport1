package Java;
import java.util.Scanner;
public class BillinputandOutput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Electricitybill eb = new Electricitybill();
    System.out.println("Enter Consumer Number: ");
    eb.ConsumerNO = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Consumer Name: ");
    eb.ConsumerName = sc.nextLine();
    System.out.println("Enter Previous Month's Reading: ");
    eb.PreviousMonthsReading = sc.nextInt();
    System.out.println("Enter Current Month's Reading: ");
    eb.CurrentMonthsReading = sc.nextInt();
    System.out.println("Enter EB Type (Domestic/Commercial): ");
    eb.EB_Type = sc.next();
    eb.CalculateBill();
    eb.displayBill();
}
}