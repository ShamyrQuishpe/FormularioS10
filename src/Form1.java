import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    private JTextField textVal1;
    private JTextField textVal2;
    private JButton transformacionButton;
    private JButton unionButton;
    private JButton cerrarButton;
    private JPanel JPanel1;
    private JButton limpiarButton;

    public Form1(){
        super("OPERACIONES");
        setContentPane(JPanel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textVal1.setText("");
                textVal2.setText("");
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre1 = textVal1.getText();
                String nombre2 = textVal2.getText();
                String resultado = nombre1 + " " + nombre2;

                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        transformacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textVal1.getText());
                    double num2 = Double.parseDouble(textVal2.getText());


                    JOptionPane.showMessageDialog(null, (num1 + num2));
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "No es posible realizar esa operacion");
                }
            }
        });
    }
}
