import java.util.*;

class QNode
{
    int data;
    QNode next;

            public QNode(int d) 
            {
                data = d;
                next = null;
            }
}

class QList
{
    QNode front;
    QNode rear;

            public QList() 
            {
                front = null;
                rear = null;
            }

            public void Enqueue(int val) 
            {
                QNode x = new QNode(val);  
                if (rear == null) 
                {
                    front=x;
                    rear=x;
                } 
                else 
                {
                    rear.next = x;
                    rear = x;
                }
                System.out.println("Enqueued: " + val);
            }

 
     public void Dequeue() {
                if (front == null) 
                {
                    System.out.println("Queue is empty, cannot dequeue.");
                    return;
                }

        // Remove the front element
        System.out.println("Dequeued: " + front.data);
        front = front.next;

                if (front == null) 
                {
                    rear = null;
                }
    }

    // Display the queue
    public void Display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        QNode temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Peek Front Operation
    public void PeekFront() {
        if (front != null) {
            System.out.println("Front element: " + front.data);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    // Peek Rear Operation
    public void PeekRear() {
        if (rear != null) {
            System.out.println("Rear element: " + rear.data);
        } else {
            System.out.println("Queue is empty.");
        }
    }
}

class LQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QList q = new QList();
        char ch;

        do {
            System.out.println("\n *** linked list doubly Queue - List Implementation *** \n");
            System.out.println("1.Enqueue Operation");
            System.out.println("2.Dequeue Operation");
            System.out.println("3.Display the queue");
            System.out.println("4.Peek Front Operation");
            System.out.println("5.Peek Rear Operation\n");

            System.out.print("Enter Your Choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value: ");
                    q.Enqueue(scan.nextInt());
                    q.Display();

                    break;

                case 2:
                    q.Dequeue();
                    q.Display();
                     
                    break;

                case 3:
                     q.Display();
                     break;

                case 4:
                        q.PeekFront();
                        q.Display();

                     break;

                case 5:
                    q.PeekRear();
                    q.Display();

                    break;

                default:
                    System.out.println("Incorrect Choice!");
            }

            System.out.print("Do you want to continue (Y/N)?: ");
            ch = scan.next().charAt(0);

        } while (ch != 'n' && ch != 'N');
    }
}
