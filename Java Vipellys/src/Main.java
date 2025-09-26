import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = initialPanel();
        panel.add(titleLabel());
        frame.add(panel);

        frame.setVisible(true);
    }

    private static JPanel initialPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        return panel;
    }

    private static JLabel titleLabel() {
        JLabel label = new JLabel();
        label.setText("The best application in the world");
        return label;
    }
}