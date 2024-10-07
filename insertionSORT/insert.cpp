/*name:
rollno:
unit 1:sorting and searching 
program: Insertion sort */
#include <iostream>
//#include <std.io>
using namespace std;
int main () 
{
	int arr[10],n,i,j;
	int min,loc,tmp;
	cout << "selection sort" <<endl <<endl;
	cout << "Enter the size of the array:";
	cin>> n;
	
	cout << "Enter the elements of the array: " <<endl;
	for(i=0;i<n;i++)
	{
		cin >> arr[i];
		
	}
	// ORIGINAL ARRAY *************
	cout <<endl <<"Original Array:";
	for(i=0;i<n;i++)
	{
		cout <<arr[i] << " ";
	}
	
	//insertion sort
	for (int i = 1; i<n;i++)
	{
		 int tmp = arr[i]; //element at the start of unsorted region
		 int pos =i-1;
		 
		 while(tmp < arr[pos]&& pos >= 0)
		 {
		 	arr[pos+1] = arr[pos];
		 	pos--;
		 	
		 }
		  //write tmp to its correct position
		  arr[pos+1] = tmp;
		  
		 
	}//end of for i

cout<< endl << "Sorted Array is now: "	;
for(i=0; i <n;i++)
{
	cout<< arr[i] <<" \a" 	;
}
	
	
}
