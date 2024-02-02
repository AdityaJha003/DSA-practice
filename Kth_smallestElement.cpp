// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

#include <bits/stdc++.h>
using namespace std;

int kthSmallest(int arr[], int N, int K)
{
	sort(arr, arr + N);

	// Return k'th element in the sorted array
	return arr[K - 1];
}

int main()
{
	int arr[] = { 12, 3, 5, 7, 19 };
	int N = sizeof(arr) / sizeof(arr[0]), K = 2;

	cout << "K'th smallest element is " << kthSmallest(arr, N, K);
	return 0;
}
