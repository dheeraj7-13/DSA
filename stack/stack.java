/* name : bhairav kedare
 * roll 1525
 */

 import java.util.*;

 class Stack
 {
    int max;
    int [] sArray;
    int tos;

    public Stack(int size)
    {
        max=size;
        sArray=new int [max];
        tos =-1;
    }
    //push 
    //pop
    //peek
    //display


}


class AStack 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack s = new Stack(4);
        char ch;

        do {
            System.out.println("\nStack array implementation");
            System.out.println("1. Push to stack");
            System.out.println("2. Pop out of stack");
            System.out.println("3. Peek operation");
            System.out.println("4. Display operation");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push:");
                    System.out.println("option 1");

                    // int element = scan.nextInt();
                    // s.push(element);
                    break;

                case 2:
                    // int poppedElement = s.pop();
                    System.out.println("option 2");

                    // if (poppedElement != -1) {
                        // System.out.println("Popped element: " + poppedElement);
                    // }
                    break;

                case 3:
                    // int peekedElement = s.peek();
                    System.out.println("option 3");

                    // if (peekedElement != -1) {
                    //     System.out.println("Peeked element: " + peekedElement);
                    // }
                    break;

                case 4:
                    // s.display();
                    System.out.println("option 4");

                    break;

                default:
                    System.out.println("Incorrect Choice");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            ch = scan.next().charAt(0);
        } while (ch != 'n' || ch != 'N');

        scan.close();
    }}
