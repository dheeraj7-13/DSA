/* name : bhairav kedare
 * roll 1525
 * objective : to perform actions on array
 */

 import java.util.Scanner;

 /* Stack Class */
 
 class Stack
 {
         int max;
         int[] sArray;
         int tos;
 
         public Stack(int size)
         {
                 max=size;
                 sArray=new int [max];
                 tos=-1;
         }
 
         //Push
         public void Push(int val)
         {
                 if(tos==max-1)
                 {
                         System.out.println("Stack Overflow!");
                 }
                 else
                 {
                         sArray[++tos]=val;
 
                 }
         }//end of push
 
         //Pop
         public void Pop()
         {
                 if(tos==-1)
                 {
                         System.out.println("Stack Underflow!");
                 }
                 else
                 {
                         System.out.println("Element popped is "+sArray[tos]);
                         tos--;
                 }
         }//end of pop
 
         //Peek
         public void Peek()
         {
                 if(tos==-1)
                 {
                         System.out.println("Stack Underflow!");
                 }
                 else
                 {
                         System.out.println("Element at the TOS: "+sArray[tos]);
                 }
 
         }//end of peek
 
         //Display
         public void Display()
         {
                 if(tos == -1)
                 {
                         System.out.println("Stack Underflow!");
                 }
                 else
                 {
                         System.out.println("Stack Contains: \n");
                         for(int i=tos;i>=0;i--)
                         {
                                 System.out.println(sArray[i]);
                         }
                 }
         }//end of Display
 }//end of stack class
 
 
 /* Menu */
 class AStack
 {
         public static void main(String[] args)
         {
                 Scanner scan=new Scanner(System.in);
                 Stack s= new Stack(4);
                 char ch;
 
                 do
                 {
                         System.out.println("\n *** Stack - Array Implementation *** \n");
                         System.out.println("1.Push an element on the stack");
                         System.out.println("2.Pop an element from the stack");
                         System.out.println("3.Peek operation");
                         System.out.println("4.Display the stack");
 
                         System.out.print("Enter Your Choice:");
 
                         int choice=scan.nextInt();
 
                         switch(choice)
                         {
                                 case 1:
                                         System.out.print("Enter the Value:");
                                         s.Push(scan.nextInt());
                                         break;
 
                                 case 2:
                                         System.out.println("Option 2");
                                         s.Pop();
                                         break;
 
                                 case 3:
                                         s.Peek();
                                         break;
 
                                 case 4:
                                         s.Display();
                                         break;
 
                                 default:
                                         System.out.println("Incorrect Choice!");
 
                         }//end of switch
 
                         System.out.print("Do you want to continue (Y/N)?: ");
                         ch=scan.next().charAt(0);
 
                 }while (ch!='n' || ch!='N');
         }//end of main
 }
