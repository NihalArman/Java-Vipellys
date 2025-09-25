import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = getPanel();
        panel.add(getLabel());
        frame.add(panel);

        frame.setVisible(true);
    }

    private static JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        return panel;
    }

    private static JLabel getLabel() {
        JLabel label = new JLabel();
        label.setText("Hello World");
        return label;
    }
}