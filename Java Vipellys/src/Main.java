import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = getPanel();
        frame.add(panel);
    }

    private static JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        return panel;
    }
}