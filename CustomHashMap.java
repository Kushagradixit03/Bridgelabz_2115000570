public class CustomHashMap {
    
    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] table;
    private int capacity;

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            newNode.next = table[index];
            table[index] = newNode;
        }
    }

    public Integer get(int key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.key == key) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean containsKey(int key) {
        return get(key) != null;
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);

        map.put(1, 10);
        map.put(2, 20);
        map.put(11, 110);

        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 11: " + map.get(11));

        map.remove(2);
        System.out.println("Value for key 2 after removal: " + map.get(2));
    }
}
