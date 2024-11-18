import java.util.*;
import java.util.Stack;
class SNode
{
    int data;
    SNode next;
    //constructor
    public SNode (int d)
    {
        data = d;
        next = null;

    }

}


class SList 
{
    SNode tos;

    SList() 
    {
        tos=null;
    }
    //push 
    public void  Push (int val)
    {   
        SNode x = new SNode(val);
        if (tos == null)
        {
                tos=x;
        }
        else
        {
                x.next = tos;  //link x to the stack
                tos =x;  //update tos

        }
    }

    //pop
    public void pop ()  
    {
        SNode x = new  SNode(5);
        if(tos == null) 
        {
                System.out.println("Stack underflow!!");
        }
        else 
        {
                System.out.println("Data Popped"+tos.data);
                tos = tos.next;
        }
        //elseif   for single node check () tmp.next==null    then its a stack 
    }
    //peek 
    public void peek()  
    {
        SNode x = new  SNode(5);
        if(tos == null) 
        {
                System.out.println("Stack underflow!!");
        }
        else 
        {
                System.out.println("Data peeped"+tos.data);
     
        }
        //elseif   for single node check () tmp.next==null    then its a stack 
    }
    //display
    public void display () 
    {
        if (tos==null) 
        { 
                        System.out.println("Stack underflow");
        }
        else 
        {
        SNode tmp = tos;
        while (tmp!=null) 
        {
                System.out.println("|"+tmp.data+"|");
                tmp = tmp.next;
        }
        


        }
    }

}


public class LStack 
{
             public static void main(String[] args)
         {
                 Scanner scan=new Scanner(System.in);
                 SList  s= new SList();
                 char ch;
 
                 do
                 {
                         System.out.println("\n *** Stack - Linkedlist Implementation *** \n");
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
                                         s.pop();
                                         break;
 
                                 case 3:
                                         s.peek();
                                         break;
 
                                 case 4:
                                         s.display();
                                         break;
 
                                 default:
                                         System.out.println("Incorrect Choice!");
 
                         }//end of switch
 
                         System.out.print("Do you want to continue (Y/N)?: ");
                         ch=scan.next().charAt(0);
 
                 }while (ch!='n' || ch!='N');
         }//end of main

}
