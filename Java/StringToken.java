package Java;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringToken {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
            int sum =0;
            while (st.hasMoreTokens()){
                String s = st.nextToken();
                sum = sum + Integer.parseInt(s);
            }
            System.out.println("The sum of the numbers is : " + sum);
        }
}

