// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

#include <bits/stdc++.h>
using namespace std;

int maxSubArraySum(int a[], int size)
{
	int maxSum = 0;
    int curSum = 0;

	for (int i = 0; i < size; i++) {
		curSum = curSum + a[i];
        if(curSum > maxSum){
            maxSum = curSum;
        }
        if(curSum < 0){
            curSum = 0;
        }
	}
	return maxSum;
}

int main()
{
	int a[] = { 5, -4, -2, 6, -1 };
    int n = sizeof(a)/sizeof(a[0]);

	// Function Call
	int max_sum = maxSubArraySum(a, n);
	cout << "Maximum contiguous sum is " << max_sum;
	return 0;
}
