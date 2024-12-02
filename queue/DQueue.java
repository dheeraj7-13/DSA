import java.util.*;

/* Node Template*/

class DQNode {
    int data;
    DQNode right;
    DQNode left;

    // Constructor
    public DQNode(int d) {
        data = d;
        right = null;
        left = null;
    }
}// end of DQNode

// Queue Template
class DQue {
    DQNode front;
    DQNode rear;

    // constructor
    public DQue() {
        front = null;
        rear = null;
    }

    // EnqueueFront
    public void EnqueueFront(int val) {
        // Make a new node
        DQNode x = new DQNode(val);

        // First Node in the queue
        if (front == null) {
            front = x;
            rear = x;
        } else {
            x.right = front;
            front.left = x;
            front = x;
        }
        Display();

    }// end of Enqueue Front

    // EnqueueRear
    public void EnqueueRear(int val) {
        // Make a new node
        DQNode x = new DQNode(val);

        // First Node in the queue
        if (front == null) {
            front = x;
            rear = x;
        } else {
            x.left = rear;
            rear.right = x;
            rear = x;
        }
        Display();
    }// end of EnqueueRear

    // DequeueRear
    public void DequeueRear() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Element removed : " + front.data);

            if (front == rear) {
                front = null;
                rear = null;
            } else {
                rear = rear.left;
                rear.right = null;
            }
        }
        Display();

    }

    // DequeueFront
    public void DequeueFront() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Element removed : " + front.data);

            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.right;
                front.left = null;
            }

        }
        Display();
    }

    // PeekFront
    public void PeekFront() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            DQNode tmp = front;
            System.out.println("Queue  Contain : ");
            System.out.print(tmp.data + " | ");
                Display();
        }
    }

    // PeekRear
    public void PeekRear() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            DQNode tmp = rear;
            System.out.println("Queue  Contain : ");
            System.out.print(tmp.data + " | ");
                Display();
        }
    }

    // Display
    public void Display() {
        if (front == null) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println("Queue contains: ");
            DQNode tmp = front;

            while (tmp != null) {
                System.out.print("|" + tmp.data + "|");
                tmp = tmp.right;
            }
        }
    }// end of Display
}// end of List

/* Menu */

class DQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DQue d = new DQue();
        char ch;

        do {
            System.out.println("\n *** Double Ended Queue *** \n");
            System.out.println("1.Enqueue Front");
            System.out.println("2.Enqueue Rear");
            System.out.println("3.Dequeue Front");
            System.out.println("4.Dequeue Rear");
            System.out.println("5.Peek Front");
            System.out.println("6.Peek Rear");
            System.out.println("7.Display\n");

            System.out.print("Enter Your Choice:");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value:");
                    d.EnqueueFront(scan.nextInt());
                    break;

                case 2:
                    System.out.print("Enter the value:");
                    d.EnqueueRear(scan.nextInt());
                    break;

                case 3:
                    d.DequeueFront();
                    break;

                case 4:
                    d.DequeueRear();
                    break;

                case 5:
                    d.PeekFront();
                    break;

                case 6:
                    d.PeekRear();
                    break;

                case 7:
                    d.Display();
                    break;

                default:
                    System.out.println("Incorrect Choice!");

            }// end of switch

            System.out.print("\nDo you want to continue (Y/N)?: ");
            ch = scan.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');// end of while
    }// end of main

}// end of DQueue
