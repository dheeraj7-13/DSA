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
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Stack s = new Stack(4);
        char ch;

        do 
        {
            System.out.println("\nStack array implementation");
            System.out.println("1.Push to stack");
            System.out.println("2.Pop out of stack");
            System.out.println("3.Peek operation");
            System.out.println("4.Display operation");
        }
    }
}
