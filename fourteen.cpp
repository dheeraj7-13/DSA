/*name: Bhairav kedare
roll no : 1525*/
#include<iostream>

using namespace std;

int main()
{
    int arr[10], n, i, k;

    cout << "Linear search " << endl << endl;

    cout << "Enter the size of the array: ";
    cin >> n;

    cout << "Enter the elements" << endl;
    for(i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Enter the key: ";
    cin >> k;

    cout << endl << "Array contains: ";
    for (i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl << "Key element: " << k << endl;
    int flag = 0;

    // Linear search 
    for(i = 0; i < n; i++)
    {
        if (arr[i] == k)
        {
            flag = 1;
            break;
        }
    }

    if (flag == 1)
    {
        cout << k << " found at index " << i << endl;
    }
    else 
    {
        cout << k << " not found" << endl;
    }

    return 0;
}


