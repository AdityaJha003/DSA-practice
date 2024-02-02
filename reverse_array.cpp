// Reversing the array by using a temporary array

#include<iostream>
using namespace std;

// Function to reverse array
void reverse(int arr[], int n){
    int temp[n];
    int k = 0;
    for(int i = n-1; i>=0; i--){       // It assigns each element of arr to temp in reverse order.
        temp[k] = arr[i];
        k++;
    }
    for(int i = 0; i<n; i++){         // This loop copies the reversed elements from temp back to the original array arr.
        arr[i] = temp[i];
    }
}

int main(){
    int arr[] = {0,1,2,3,4,5,6,7,8,9};
    int n = sizeof(arr)/sizeof(arr[0]);    // calculates the size of the array by dividing the total size of the array by the size of one element.
    reverse(arr, n);                       // display the array
    for(int i = 0; i<n; i++){              
        cout << arr[i] << " ";
    }
    return 0;
}