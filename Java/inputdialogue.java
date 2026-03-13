package Java;
import javax.swing.JOptionPane;

public class inputdialogue {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");// Prompt the user to enter their name and store it in a variable
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");// Display a greeting message with the user's name
        String ageString = JOptionPane.showInputDialog("How old are you?");// Prompt the user to enter their age and store it in a variable
        int age = Integer.parseInt(ageString);// Convert the age from a string to an integer
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");// Display the user's age
        String f_name = JOptionPane.showInputDialog("Enter your name; ", "sabed");// Prompt the user to enter their name with a default value and store it in a variable
        JOptionPane.showMessageDialog(null, "Hello, " + f_name + "!");// Display a greeting message with the user's name
        String color = JOptionPane.showInputDialog(null, "What is your favorite color?", "Color Input", JOptionPane.QUESTION_MESSAGE);// Prompt the user to enter their favorite color with a custom message and store it in a variable
        JOptionPane.showMessageDialog(null, "Your favorite color is " + color + ".");// Display the user's favorite color
    }
}

