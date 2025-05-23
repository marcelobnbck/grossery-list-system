import java.util.ArrayList;
import java.util.List;

public class GroceryTODOList {
    private List<GroceryItem> groceryItems;

    public GroceryTODOList() {
        this.groceryItems = new ArrayList<>();
    }

    public void addItem(String name) {
        groceryItems.add(new GroceryItem(name));
    }

    public void removeItem(String name) {
        groceryItems.removeIf(item -> item.getName().equals(name));
    }

    public void markAsDone(String name) {
        for (GroceryItem item : groceryItems) {
            if (item.getName().equals(name)) {
                item.markAsDone();
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public void markAsNotDone(String name) {
        for (GroceryItem item : groceryItems) {
            if (item.getName().equals(name)) {
                item.markAsNotDone();
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public void listAll() {
        for (GroceryItem item : groceryItems) {
            System.out.println(item);
        }
    }

    public void listDone() {
        for (GroceryItem item : groceryItems) {
            if (item.isDone()) {
                System.out.println(item);
            }
        }
    }

    public void listNotDone() {
        for (GroceryItem item : groceryItems) {
            if (!item.isDone()) {
                System.out.println(item);
            }
        }
    }
}