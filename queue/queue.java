import java.util.*;

class Queue {
    int front;
    int rear;    
    int max;
    int[] qArray;

 
 
    public Queue(int size) {
        max = size;
        qArray = new int[max];
        front = -1;
        rear = -1;
    }
    //enqueue
     public void enqueue(int val) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow!!!");
        } else {
            // First element in the queue
            if (front == -1) {
                front++; // Set front to 0 when the first element is inserted
            }
            rear++;  // Increment the rear pointer
            qArray[rear] = val;  // Insert value at the rear
        }
    }
    //dequeue
    public void dequeue() 
    {
        //empty queue
        if(front==-1)
        {
            System.out.println("queue underflow");

        }
        else
        {
            System.out.println("element remove is: " +qArray[front]);
            if(front== rear)
            {
                front=-1;
                rear=-1;
            }
            else 
            {
                front++;
            }
        }
    }

        //peekfront
        public void peekfront() 
        {
            //empty queue
            if(front==-1)
            {
                System.out.println("queue underflow");
    
            }
            else
            {
                System.out.println("element remove is: " +qArray[front]);
                if(front== rear)
                {
                    front=-1;
                    rear=-1;
                }
                else 
                {
                    System.out.println("Element at the front:"+qArray[front]);                
                }
            }
        }



        //peekrear
                //peekfront
                public void peekrear() 
                {
                    //empty queue
                    if(front==-1)
                    {
                        System.out.println("queue underflow");
            
                    }
                    else
                    {
                        System.out.println("element remove is: " +qArray[rear]);
                        if(front== rear)
                        {
                            front=-1;
                            rear=-1;
                        }
                        else 
                        {
                            System.out.println("Element at the front:"+qArray[rear]);                
                        }
                    }
                }
        
    








    //display
     public void display() {
        // Check for empty queue
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Queue contains:");
            for (int i = front; i <= rear; i++) {
                System.out.print(qArray[i] + " ");
            }
            System.out.println();  // Print a newline at the end
        }
    }

     public void peekFront() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + qArray[front]);
        }
    }

    // Optional: Peek rear operation (returns the element at the rear)
    public void peekRear() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Rear element: " + qArray[rear]);
        }
    }
}

// Menu-driven class
class QArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue q = new Queue(4); // Create queue with size 4
        char ch;

        do {
            System.out.println("\n*** Queue Array Implementation ***");
            System.out.println("1. Enqueue operation");
            System.out.println("2. Dequeue operation");
            System.out.println("3. Display the queue");
            System.out.println("4. Peek front operation");
            System.out.println("5. Peek rear operation\n");
            System.out.println("Enter your choice: ");
            
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enqueue a value: ");
                    q.enqueue(scan.nextInt());
                    break;

                case 2:
                    
                    System.out.println("Dequeue was done.");
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    q.peekFront();
                    break;

                case 5:
                    q.peekRear();
                    break;

                default:
                    System.out.println("Incorrect Choice!");
            }

            System.out.println("Do you want to continue? (y/n)");
            ch = scan.next().charAt(0);

        } while (ch != 'n' || ch != 'N');
    }
}
