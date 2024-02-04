// https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

// Code for program to cyclically rotate an array by one

#include <iostream>
using namespace std;

void rotate(int arr[], int n)
{

	// store the last element in a variable
	int last_el = arr[n - 1];

	// assign every value by its predecessor
	for (int i = n - 1; i > 0; i--) {
		arr[i] = arr[i - 1];
	}

	// first element will be assigned by last element
	arr[0] = last_el;
}

int main()
{
	int arr[] = { 1, 2, 3, 4, 5 };
	int n = sizeof(arr) / sizeof(arr[0]);

	// Printing initial array
	cout << "Given array is \n";
	for (int i = 0; i < n; i++)
		cout << arr[i] << ' ';

	// Calling rotate function
	rotate(arr, n);

	// Printing rotated array
	cout << "\nRotated array is\n";
	for (int i = 0; i < n; i++)
		cout << arr[i] << ' ';

	return 0;
}
