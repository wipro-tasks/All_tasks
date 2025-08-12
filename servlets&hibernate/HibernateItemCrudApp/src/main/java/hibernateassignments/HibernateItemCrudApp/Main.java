package hibernateassignments.HibernateItemCrudApp;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemDAO dao = new ItemDAO();
        int choice;

        do {
            
            System.out.println("Hibernate Item CRUD");
            System.out.println("-------------------------------");
            System.out.println("1. Add\n2. View All\n3. Update\n4. Delete\n5. Get by ID\n0. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    Item newItem = new Item();
                    newItem.setName(name);
                    newItem.setPrice(price);
                    dao.addItem(newItem);
                    System.out.println("Item added.");
                    break;

                case 2:
                    List<Item> list = dao.getAllItems();
                    for (Item item : list) {
                        System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    Item itemToUpdate = dao.getItemById(updateId);
                    if (itemToUpdate != null) {
                        System.out.print("Enter new name: ");
                        itemToUpdate.setName(sc.nextLine());
                        System.out.print("Enter new price: ");
                        itemToUpdate.setPrice(sc.nextDouble());
                        dao.updateItem(itemToUpdate);
                        System.out.println("Item updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    dao.deleteItem(deleteId);
                    System.out.println("Item deleted if found.");
                    break;

                case 5:
                    System.out.print("Enter ID to fetch: ");
                    int getId = sc.nextInt();
                    Item item = dao.getItemById(getId);
                    if (item != null) {
                        System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 0:
                    dao.close();
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);

        sc.close();
    }
}
