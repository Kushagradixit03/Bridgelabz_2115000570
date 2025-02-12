class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head;

    public Inventory() {
        this.head = null;
    }

    public void addFirst(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addLast(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newItem;
    }

    public void removeItem(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void updateQuantity(int itemId, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
    }

    public Item searchItem(int itemId) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayItems() {
        Item current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }

    public double totalInventoryValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        return totalValue;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addFirst("Item1", 1, 10, 100.0);
        inventory.addLast("Item2", 2, 20, 150.0);
        inventory.addLast("Item3", 3, 5, 200.0);

        inventory.displayItems();
        System.out.println("Total Inventory Value: " + inventory.totalInventoryValue());

        inventory.removeItem(2);
        inventory.displayItems();
    }
}
