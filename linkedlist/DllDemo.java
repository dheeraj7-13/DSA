import java.util.Scanner;

// 1. Node Class for Doubly Linked List
class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}

// 2. Doubly Linked List Class
class DList {
    Node head;
    Node tail;
    int size;

    // Constructor
    public DList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Return the size of the list
    public int getSize() {
        return size;
    }

    // Insert at the tail of the list
    public void InsertTail(int val) {
        Node newNode = new Node(val);
        if (head == null) { // If the list is empty
            head = newNode;
            tail = newNode;
        } else { // If the list is not empty
            tail.right = newNode;
            newNode.left = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert at the start of the list
    public void InsertStart(int val) {
        Node newNode = new Node(val);
        newNode.right = head;
        if (head != null) {
            head.left = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    // Delete a node from the list
    public void deleteNode(int val) {
        Node tmp = head;

        // Traverse the list to find the node with the specified value
        while (tmp != null) {
            if (tmp.data == val) {
                // Identify which case to handle using a switch statement
                int caseType = (tmp == head) ? 1 : (tmp == tail) ? 2 : 3;

                switch (caseType) {
                    case 1: // Case 1: Node to be deleted is the head node
                        head = tmp.right; // Move head to the next node
                        if (head != null) {
                            head.left = null; // Disconnect the new head from the old node
                        }
                        break;

                    case 2: // Case 2: Node to be deleted is the tail node
                        tail = tmp.left; // Move tail to the previous node
                        if (tail != null) {
                            tail.right = null; // Disconnect the new tail from the old node
                        }
                        break;

                    case 3: // Case 3: Node to be deleted is in the middle
                        tmp.left.right = tmp.right; // Update the right link of the previous node
                        tmp.right.left = tmp.left;  // Update the left link of the next node
                        break;
                }
                size--; // Decrease the size of the list
                return; // Node is deleted, exit the method
            }
            tmp = tmp.right; // Move to the next node
        }

        // If we reach here, the value was not found
        System.out.println("Node with value " + val + " not found.");
    }

    // Display the list from head to tail
    public void Display() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " <-> ");
            tmp = tmp.right;
        }
        System.out.println("null");
    }

    // Display the list from tail to head (reverse order)
    public void DisplayReverse() {
        Node tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.data + " <-> ");
            tmp = tmp.left;
        }
        System.out.println("null");
    }
}

// Main class
public class DllDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DList d = new DList();
        char ch;

        do {
            System.out.println("*** Doubly Linked List ***");
            System.out.println("1. Insert at the end of the list");
            System.out.println("2. Size of the list");
            System.out.println("3. Display the list (Forward)");
            System.out.println("4. Display the list (Reverse)");
            System.out.println("5. Insert at the Start of the list");
            System.out.println("6. Delete a node from the list");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to insert at the end: ");
                    d.InsertTail(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Size of the list: " + d.getSize());
                    break;
                case 3:
                    System.out.println("List in forward order:");
                    d.Display();
                    break;
                case 4:
                    System.out.println("List in reverse order:");
                    d.DisplayReverse();
                    break;
                case 5:
                    System.out.print("Enter a value to insert at the start: ");
                    d.InsertStart(scan.nextInt());
                    break;
                case 6:
                    System.out.print("Enter a value for deletion: ");
                    d.deleteNode(scan.nextInt());
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            ch = scan.next().charAt(0);
        } while (ch != 'n' && ch != 'N'); // End of do-while loop

        scan.close(); // Close the scanner to prevent resource leak
    }
}
