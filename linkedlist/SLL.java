import java.util.Scanner;

// 1. Node Class
class Node {
    int data; 
    Node next;

    public Node(int d) {
        data = d; 
        next = null;
    }
} // end of Node class

// 2. List Class
class List {
    Node head;
    Node tail; 
    int size;

    // Constructor
    public List() {
        head = null; 
        tail = null; 
        size = 0;
    }

    // Return size of the list
    public int getSize() {
        return size;
    }

    // Insert at the Tail
    public void InsertTail(int val) {
        Node newNode = new Node(val);
        if (head == null) { // empty list
            head = newNode; 
            tail = newNode;
        } else {
            tail.next = newNode; 
            tail = newNode;
        }
        size++; // Increment size
    } // end of InsertTail

    // Insert at the Head
    public void InsertStart(int val) {
        Node newNode = new Node(val);
        newNode.next = head; 
        head = newNode;
        if (tail == null) { // If the list was empty
            tail = newNode;
        }
        size++; // Increment size
    } // end of InsertStart

    // Display the list
    public void Display() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    } // end of Display

    // Search Node
    public void Search(int val) {
        Node tmp = head; 
        boolean found = false;

        while (tmp != null) {
            if (tmp.data == val) {
                found = true; 
                break;
            }
            tmp = tmp.next;
        }

        if (found) {
            System.out.println(val + " is Found");
        } else {
            System.out.println(val + " is not Found");
        }
    } // end of Search

    // Deletion of node
    public void Del(int val) {
        Node tmp = head;
        Node prev = null; 

        while (tmp != null) {
            if (tmp.data == val) {
                break; // Node found
            }
            prev = tmp; 
            tmp = tmp.next;
        }

        // If node not found
        if (tmp == null) {
            System.out.println("Value not found");
            return;
        }

        // Deleting node
        if (tmp == head) { // Head node deletion
            head = head.next;
            if (head == null) { // If the list is now empty
                tail = null;
            }
        } else if (tmp == tail) { // Tail node deletion
            tail = prev;
            tail.next = null;
        } else { // Any other node deletion
            prev.next = tmp.next;
        }
        size--; // Decrement size
    } // end of Del
} // end of List class

// 3. Interface class SLL
public class SLL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List s = new List();
        char ch;

        do {
            System.out.println("*** Singly Linked List ***");
            System.out.println("1. Insert at the end of the list");
            System.out.println("2. Size of the list");
            System.out.println("3. Display the list");
            System.out.println("4. Search in the list");
            System.out.println("5. Insert at the Start of the list");
            System.out.println("6. Deletion of Node");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value at end: ");
                    s.InsertTail(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Size: " + s.getSize() + "\n");
                    break;
                case 3:
                    System.out.print("SLL contains: ");
                    s.Display();
                    break;
                case 4:
                    System.out.print("Value to Search: ");
                    s.Search(scan.nextInt());
                    break;
                case 5:
                    System.out.print("Enter a value to insert at start: ");
                    s.InsertStart(scan.nextInt());
                    s.Display();
                    break;
                case 6:
                    System.out.print("Enter a value for deletion: ");
                    s.Del(scan.nextInt());
                    s.Display();
                    break;
                default:
                    System.out.println("Incorrect Choice");
            } // end of switch

            System.out.print("Do you want to continue? (Type: Y or N) ");
            ch = scan.next().charAt(0);
        } while (ch != 'n' && ch != 'N'); // end of do while
        
        scan.close(); // Close scanner to prevent resource leak
    } // end of main
} // end of class SLL
