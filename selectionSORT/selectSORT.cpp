/* 
Name: bhairav kedare 
roll no: 1525
title:selection sort
*/

#include <iostream>
//#include <std.io>
using namespace std;
int main() 
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
	
	
	
	
	
	//Selection SORT *********************
	for(int i=0;i<n;i++)  //1 - - -5
	{
		//the assumed min no. and its location
		min =arr[i];
		//loc of unsorted 1st location
		loc =i;
		//find the min of unsorted region
				for(int j=i+1;j<n;j++)   //(1+1) - - - 5  UNSORTED ARRAY
				{
					if(arr[j]< min)
					{
						min = arr[j];
						loc =j;
					}
				}// end of j loop
		//exchange min and first element of unsorted region		
		tmp = arr[i];
		arr[i] = arr[loc];
		arr[loc] = tmp;
  // XOR swap
//    a = a ^ b;
//    b = a ^ b;
//    a = a ^ b;


	}//end of i loop
	cout<<endl<<"sorted Array:";
	for(i=0;i<n;i++)
	{
		cout << arr[i]<< " ";
	}
}

