import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Form1();
                frame.setSize(400,400);
                frame.setVisible(true);
            }
        });
    }
}