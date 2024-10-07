
/*   Name: bhairav kedare	
	 R.No: 1525
	 Unit 1: Sorting
  	 Program: Bubble Sort */

#include<iostream>

using namespace std;

int main()
{
	int arr[10],n,i;
	
	cout << "*** Bubble Sort Program ***\n\n";
	
	cout << "Enter the size of the array: ";
	cin >> n;
	
	cout << "Enter values in the array: " << endl;
	for(i=0; i<n; i++)
	{
		cin >> arr[i];
	}//end of for i
	
	cout << endl;
	cout << "The original array: ";
	for(i=0; i<n; i++)
	{
		cout << arr[i] << " ";
	}
 } 
