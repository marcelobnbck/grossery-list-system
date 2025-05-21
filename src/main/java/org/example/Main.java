import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroceryTODOList todoList = new GroceryTODOList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Mark as done");
            System.out.println("4. Mark as not done");
            System.out.println("5. List all");
            System.out.println("6. List done");
            System.out.println("7. List not done");
            System.out.println("8. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter item name: ");
                    todoList.addItem(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    todoList.removeItem(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    todoList.markAsDone(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter item name: ");
                    todoList.markAsNotDone(scanner.nextLine());
                    break;
                case 5:
                    todoList.listAll();
                    break;
                case 6:
                    todoList.listDone();
                    break;
                case 7:
                    todoList.listNotDone();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
