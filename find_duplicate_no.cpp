// https://leetcode.com/problems/find-the-duplicate-number/description/

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.


#include <bits/stdc++.h>
using namespace std;

vector<int> duplicates(int arr[], int n){
	// To store duplicates numbers.
	vector<int> ans;

	// First check all the values that are present in an array then go to that values as indexes and increment by the size of array
	for (int i = 0; i < n; i++) {
		int index = arr[i] % n;
		arr[index] += n;
	}

	// Now check which value exists more than once by dividing with the size of array
	for (int i = 0; i < n; i++) {
		if ((arr[i] / n) >= 2)
		ans.push_back(i);
	}
return ans;
}

int main()
{
	int arr[] = { 1, 6, 3, 1, 3, 6, 6 };
	int arr_size = sizeof(arr) / sizeof(arr[0]);

	cout << "The repeating elements are: \n";

	// Function call
	vector<int> ans = duplicates(arr, arr_size);
	for (auto x : ans)
		cout << x << " ";

	return 0;
}
