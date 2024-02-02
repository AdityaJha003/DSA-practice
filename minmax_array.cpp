// Finding the minimum and maximum of an array using sorting

#include <bits/stdc++.h>
using namespace std;

struct Pair {
	int min;
	int max;
};

Pair getMinMax(int arr[], int n)
{
	Pair minmax;
	sort(arr, arr + n);

	minmax.min = arr[0];
	minmax.max = arr[n - 1];

	return minmax;
}

int main()
{
	int arr[] = { 1000, 11, 445, 1, 330, 3000 };
	int arr_size = sizeof(arr) / sizeof(arr[0]);

	Pair minmax = getMinMax(arr, arr_size);

	cout << "Minimum element is " << minmax.min << endl;
	cout << "Maximum element is " << minmax.max << endl;

	return 0;
}
