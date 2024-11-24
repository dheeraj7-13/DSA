import java.util.*;

class CirQue {
    int front;
    int rear;    
    int max;
    int cnt;
    int[] qArray;
    //constructor
    public CirQue(int size)
    {
        max= size;
        qArray= new int[max];
        front =-1;
        rear= -1;
        cnt = 0;

    }
        
    
    //enqueue
    public void enqueue( int val)
    {
        //queue full
        if(cnt== max )
        {
            System.out.println("Queue Overflow!!!");
        }
        else
        {
            if(cnt==0)//first element
            {
                front =0;
                
            }
                rear = (rear+1)%max;

            
            qArray[rear] = val;
            cnt++;
        }
    }
    //dequeue
    public void dequeue() 
    {
        //empty queue
        if(cnt==0)
        {
            System.out.println("queue underflow");

        }
        else
        {
            System.out.println("element remove is: " +qArray[front]);
            //single element
            if(front== rear)
            {
                front=-1;
                rear=-1;
            }
            else 
            {
                front= (front+1)%max;
            }
            cnt--;
        }
    }

    //display
    public void display()
    {
        if(cnt==0)
        {
            System.out.println("Queue underflow!!!");

        }
        else
        {
            System.out.println("Queue Contains:");
            int j = front;
            for(int i=1;i<=cnt;i++)
            {
                System.out.println(qArray[j]+" ");
                j = (j+1)%max;
            }
        }
    }
    //peekfront
    public void peekfront() 
    {
        //empty queue
        if(cnt==0)
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
    public void peekrear() 
    {
        //empty queue
        if(cnt==0)
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



}


class CQueue
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        CirQue q = new CirQue(4); // Create queue with size 4
        char ch;

        do 
        {
            System.out.println("\n*** Circular Queue Array Implementation ***");
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
                    q.display();

                    break;

                case 2:
                    
                    System.out.println("Dequeue was done.");
                    q.dequeue();
                    q.display();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    q.peekfront();
                    break;

                case 5:
                    q.peekrear();
                    break;

                default:
                    System.out.println("Incorrect Choice!");
            }

            System.out.println("Do you want to continue? (y/n)");
            ch = scan.next().charAt(0);

        } while (ch != 'n' || ch != 'N');
    }
    
}
 
