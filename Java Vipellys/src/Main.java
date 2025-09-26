import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = initialPanel();
        panel.add(titleLabel());
        panel.add(userInputTextField());
        panel.add(saveButton());
        frame.add(panel);

        frame.setVisible(true);
    }

    private static JPanel initialPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        return panel;
    }

    private static JLabel titleLabel() {
        JLabel label = new JLabel();
        label.setBounds(100, 0, 300, 20);
        label.setText("The best application in the world");
        return label;
    }

    private static JTextField userInputTextField() {
        JTextField textField = new JTextField();
        textField.setColumns(20);
        textField.setBounds(100, 50, 200, 30);
        return textField;
    }

    private static JButton saveButton() {
        JButton button = new JButton();
        button.setText("save");
        button.setBounds(140, 100, 120, 30);
        return button;
    }
}