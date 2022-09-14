import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome, %s, to Java Programming", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
