/*
	Name : Atharva Naik
	Roll No: 1540
	Unit 4: List
	Program: Cicular Linked List
*/

import java.util.Scanner;

// Node Class

class CNode
{
	int data;
	CNode next;
	
	//Constructor
	public CNode(int d)
	{
		data = d;
		next = null;
	}

}// end of CNode

// List Class

class CList
{
	CNode head;
	CNode tail;
	
	//Constructor
	public CList()
	{
		head = null;
		tail = null;
	}

	//Insert at the tail of the list
 	public void InsertTail(int val)
	{
		//Make a node
		CNode x = new CNode(val);

		//Check for first node in the CLL
		if(head == null)
		{
			head = x;
			tail = x;
			tail.next = head;	//Connection Between Tail & Head
		}
		else
		{
			tail.next = x;		// Attach x to the tail of the CLL
			tail = x;		//Update tail
			tail.next = head;	//Link the new tail to the head
		}
	
	}// End of insertTail


	//Display the list
	public void Display()
	{
		if(head == null)
		{
			System.out.println("Empty list");
		}
		else
		{
			CNode tmp = head;
		do
		{
			System.out.print(tmp.data + "-->");
			tmp = tmp.next;
		}
		while(tmp!=head);

		System.out.println("Back to Head");
		}//End of If Else
	}

//Count the node in the CLL

//Search for a node in the CLL

//Delete a Node

}// End of CList

//Interface
class CLL
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// Create an object of CList
		CList c = new CList();

		char ch;
		do 
		{
			System.out.println("*** CICULAR LINKED LIST ***\n");
			System.out.println("1. Insert at the tail of CLL");
			System.out.println("2. Display the CLL");
			System.out.println("3. Count the Nodes in the CLL");
			System.out.println("4. Search for a node in the CLL");
			System.out.println("5. Delete a node in the CLL\n");

			System.out.print("Enter your Choice: ");
			int choice = scan.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.println("Enter a Value: ");
					c.InsertTail(scan.nextInt());
					
					break;
				case 2:
					System.out.println("CLL contains: ");
					c.Display();
					System.out.println("");
					break;
				case 3:
					System.out.println("Opt 3");
					break;
				case 4:
					System.out.println("Opt 4");
					break;
				case 5:
					System.out.println("Opt 5");
					break;
				default:
					System.out.println("Default");

			}// End of Switch
			System.out.println("Do you want to continue?? (Type: Y or N)");
			ch = scan.next().charAt(0);
		}
		while(ch == 'y' || ch == 'Y');// End of Do while loop
	}// End of Main
}// End of CLL