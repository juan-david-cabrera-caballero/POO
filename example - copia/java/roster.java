import java.util.ArrayList;
import java.util.List;

public class roster {
    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public String getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
}