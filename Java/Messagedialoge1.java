import javax.swing.JOptionPane;
public class Messagedialoge1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Wrong answer", "Feedback" , JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Correct answer", "Feedback" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Please try again", "Feedback" , JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a plain message", "Feedback" , JOptionPane.PLAIN_MESSAGE);
        //String userAnswer = JOptionPane.showInputDialog(null, "Enter your answer", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
        //System.out.println("User's answer: " + userAnswer);
    }
}
