
import java.util.*;

class Queue 
{
    int front;
    int rear;    
    int max ;
    int[]qArray;

    public Queue(int size)
    {
        max= size;
        qArray=new int[max];
        front =-1;
        rear=-1;
    }

    //enqueue funciton 
    //dequeue funciton
    //display
    //peekfront
    //peekrear


}

//menu
class QArray
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Queue q = new Queue (4);
        char ch;
        do 
        {
            System.out.println("\n*** Queue Array Implementation***\n");
            System.out.println("1. Enqueue operation");
            System.out.println("2. Dequeue operation");
            System.out.println("3. Display the queue");
            System.out.println("4. Peek front operation");
            System.out.println("5. Peek rear operation\n");

            System.out.println("Enter your choice: ");
            int choice=scan.nextInt();

            switch(choice)
            {
                    case 1:
                    System.out.println("Option 1");
                    break;

                    case 2:
                    System.out.println("Option 2");
                            break;

                    case 3:
                    System.out.println("Option 3");

                            break;

                    case 4:
                    System.out.println("Option 4");

                            break;

                    default:
                            System.out.println("Incorrect Choice!");

            }//end of switch

            
            ch=scan.next().charAt(0);
        }while (ch!='n' || ch!='N');
        
    }
}
