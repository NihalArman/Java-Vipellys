import javax.swing.*;

public class ViewModel {
    private DefaultListModel<String> savedItems = new DefaultListModel<>();
    private DefaultListModel<String> displayedItems = new DefaultListModel<>();

    public JList<String> getItems() {
        return new JList<>(this.displayedItems);
    }

    public void saveItems(String text) {
        if (!text.isEmpty()) {
            this.savedItems.addElement(text);
        }
    }

    public void updateItems() {
        for(int itemNumber = 0; itemNumber < savedItems.size(); itemNumber++) {
            displayedItems.addElement(savedItems.getElementAt(itemNumber));
        }
    }
}
