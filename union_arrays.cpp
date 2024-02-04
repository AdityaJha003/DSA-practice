// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

// Program for the union of two arrays using Set

#include <bits/stdc++.h>
using namespace std;
void getUnion(int a[], int n, int b[], int m)
{
	int min = (n < m) ? n : m;

	// Defining set container s
	set<int> s;

	// add elements from both the arrays for index from 0 to min(n, m)-1
	for (int i = 0; i < min; i++) {
		s.insert(a[i]);
		s.insert(b[i]);
	}

	if (n > m) {
		for (int i = m; i < n; i++) {
			s.insert(a[i]);
		}
	}
	else if (n < m) {
		for (int i = n; i < m; i++) {
			s.insert(b[i]);
		}
	}

	cout << "Number of elements after union operation: "
		<< s.size() << endl;
	cout << "The union set of both arrays is :" << endl;
	for (auto itr = s.begin(); itr != s.end(); itr++)
		cout << *itr << " ";          // s will contain only distinct elements from array a and b
}

int main()
{
	int a[9] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
	int b[10] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

	getUnion(a, 9, b, 10);
}
