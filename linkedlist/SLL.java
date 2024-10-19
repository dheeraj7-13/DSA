import java.util.Scanner;
import java.util.*;
/*NODE TEMPLATE*/
class Node 
{
	int data;
	Node next;
	/*Constructor*/
	public Node (int d)
	{
		data = d;
		next=null;
	}

}// end of node


/*LIST TEMPLATE*/
 class List 
{
	Node head;
	Node tail;

	/*constructor*/
	public List()
	{
		head = null;	
		tail = null;
	}
	/*Insert at the end of SLL*/
	/*count the numbe rof nodes*/
	/*Display the SLL*/
	/*Search for a node*/
	/*Delete a node*/
}//end class list
/*3. Interface */
class SLL
{
	public static void main(String [] args)

	{
		Scanner scan = new Scanner(System.in);

		// create object of list
		List s = new List();
	
		char ch;

		do 
		{	
			System.out.println("*SINGLE LINKED LIST*\n");	

			System.out.println("1. Insert at the end of the SLL");	
			System.out.println("2. Count the number of nodes");	
			System.out.println("3. Display the SLL");	
			System.out.println("4. Search for a node");	
			System.out.println("5. Delete a node");	

			System.out.println(" Enter your choice : ");	
			int choice = scan.nextInt();

				switch(choice)
				{
					case 1:
						System.out.println("IN option 1");			
						break;
					case 2:
						System.out.println("IN option 2");			
						break;
					case 3:
						System.out.println("IN option 3");			
						break;
					case 4:
						System.out.println("IN option 4");			
						break;
					case 5:
						System.out.println("IN option 5");			
						break;

					default:
						System.out.println("Incorrect option!");
				}//end of switch

				System.out.println("Do you want to continue (Type y or n) : ");
				ch = scan.next().charAt(0);











			


		}while(ch=='y' || ch=='Y'); //end of do while loop
	}//end of main		
}//end of SLL