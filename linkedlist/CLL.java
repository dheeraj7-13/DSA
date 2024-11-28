import java.util.*;

/* Node Template */
class CNode {
    int data;
    CNode next;

    // Constructor
    public CNode(int data) {
        this.data = data;
        next = null;
    }
} // end of CNode

// List Template
class CList {
    CNode head;
    CNode tail;

    public CList() {
        head = null;
        tail = null;
    }

    /* Insert at the end of the List */
    public void InsertTail(int val) {
        // 1. Make a new Node
        CNode x = new CNode(val);

        // 2. First node in CLL
        if (head == null) {
            head = x;
            tail = x;
            tail.next = head; // Circularity
        } else {
            tail.next = x; // Link x to the tail
            tail = x; // Update tail
            tail.next = head; // Circularity
        }
    } // end of InsertTail

    /* Display the CLL */
    public void Display() {
        if (head == null) {
            System.out.println("Empty CLL");
            return;
        }

        CNode tmp = head;

        do {
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        } while (tmp != head);
        System.out.println("Back to head");
    }

    /* Count the number of nodes */
    public void Count() {
        int count = 0;
        if (head == null) {
            System.out.println("Empty CLL");
            return;
        }

        CNode tmp = head;

        do {
            count++;
            tmp = tmp.next;
        } while (tmp != head);
        System.out.println("Number of Nodes: " + count);
    }

    /* Search for a node */
    public void Search(int val) {
        if (head == null) {
            System.out.println("Empty CLL");
            return;
        }
        CNode tmp = head;
        int flag = 0;

        do {
            if (tmp.data == val) {
                flag = 1;
                break;
            }
            tmp = tmp.next;
        } while (tmp != head);

        if (flag == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

    /* Delete a node */
    public void Delete(int val) {
        if (head == null) {
            System.out.println("Empty CLL");
            return;
        }

        // Case 1: Single node in the list
        if (head == tail && head.data == val) {
            head = null;
            tail = null;
            System.out.println("Deleted");
            return;
        }

        CNode current = head;
        CNode prev = null;

        // Case 2: Deleting the head
        if (head.data == val) {
            tail.next = head.next;
            head = head.next;
            System.out.println("Deleted");
            return;
        }

        // Case 3: Searching for the node to delete
        do {
            prev = current;
            current = current.next;
            if (current.data == val) {
                prev.next = current.next;

                // If deleting the tail, update tail reference
                if (current == tail) {
                    tail = prev;
                }

                System.out.println("Deleted");
                return;
            }
        } while (current != head);

        System.out.println("Not found");
    }
} // end of List

/* Interface */
class CLL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create object of list
        CList c = new CList();

        char ch;
        do {
            System.out.println("*** Circular Linked List ***\n");

            System.out.println("1.Insert a node at the tail");
            System.out.println("2.Display the CLL");
            System.out.println("3.Count the number of nodes");
            System.out.println("4.Search for a node");
            System.out.println("5.Delete a node \n");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Value: ");
                    c.InsertTail(scan.nextInt());
                    c.Display();
                    break;

                case 2:
                    c.Display();
                    break;

                case 3:
                    c.Count();
                    break;

                case 4:
                    System.out.print("Enter the Value: ");
                    c.Display();
                    c.Search(scan.nextInt());
                    break;

                case 5:
                    System.out.print("Enter the Value to Delete: ");
                    c.Delete(scan.nextInt());
                    c.Display();
                    break;

                default:
                    System.out.print("Incorrect Choice!");
            } // end of switch

            System.out.print("Do you want to continue?(y or n) ");
            ch = scan.next().charAt(0);

        } while (ch != 'n' && ch != 'N'); // end of do while
    } // end of main
} // end of CLL
