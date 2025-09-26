import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JTextField textField;
    private ViewModel viewModel = new ViewModel();

    public void createUI() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = initialPanel();
        panel.add(titleLabel());
        panel.add(userInputTextField());
        panel.add(saveButton());
        panel.add(displayItems());
        panel.add(showButton());
        frame.add(panel);

        frame.setVisible(true);
    }

    private JPanel initialPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        return panel;
    }

    private JLabel titleLabel() {
        JLabel label = new JLabel();
        label.setBounds(100, 0, 300, 20);
        label.setText("The best application in the world");
        return label;
    }

    private JTextField userInputTextField() {
        textField = new JTextField();
        textField.setColumns(20);
        textField.setBounds(100, 50, 200, 30);
        return textField;
    }

    private JButton saveButton() {
        JButton button = new JButton();
        button.setText("save");
        button.setBounds(140, 100, 120, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText().trim();
                viewModel.saveItems(text);
                textField.setText("");
            }
        });
        return button;
    }

    private JButton showButton() {
        JButton button = new JButton();
        button.setText("show items");
        button.setBounds(170, 420, 120, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewModel.updateItems();
            }
        });
        return button;
    }

    private JScrollPane displayItems() {
        JScrollPane scrollPane = new JScrollPane(viewModel.getItems());
        scrollPane.setBounds(60, 200, 400, 200);
        return scrollPane;
    }
}
