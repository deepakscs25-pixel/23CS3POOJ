import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntegerDivisionUI extends JFrame {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public IntegerDivisionUI() {
        
        super("Integer Division");

        
        JLabel num1Label = new JLabel("Num1:");
        JLabel num2Label = new JLabel("Num2:");
        JLabel resultLabel = new JLabel("Result:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        divideButton = new JButton("Divide");

        
        setLayout(new GridLayout(4, 2, 10, 10));
        add(num1Label); add(num1Field);
        add(num2Label); add(num2Field);
        add(resultLabel); add(resultField);
        add(new JLabel()); 
        add(divideButton);

        
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter valid integers!",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE);

                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Cannot divide by zero!",
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new IntegerDivisionUI();
    }
}
