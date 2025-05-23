public class GroceryItem {
    private String name;
    private boolean isDone;

    public GroceryItem(String name) {
        this.name = name;
        this.isDone = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markAsNotDone() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return name + " - " + (isDone ? "Done" : "Not Done");
    }
}