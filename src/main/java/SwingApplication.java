import javax.swing.*;

public class SwingApplication {

    public static void main(String[] args) {
        JFrame f = new JFrame("main");
        f.setSize(400, 200);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World");
        f.add(label);
        f.setVisible(true);
    }
}
