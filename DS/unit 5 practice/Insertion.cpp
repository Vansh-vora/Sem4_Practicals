//Insertion Sort
#include<iostream>
using namespace std;
#define size 5
void insertion_sort(int arr[],int n);
int main(){
  int arr[size],n;
  cout<<"\nEnter the number of elements in the array:";
  cin>>n;
  cout<<"\n Enter the element in array:";

  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  insertion_sort(arr,n);

  cout<<"\n Sorted Array";
  for(int i=0;i<n;i++){
    cout<<arr[i]<<" ";
  }
  return 0;
}
void insertion_sort(int arr[],int n){
  int i,j,temp;
  for(i=0;i<n;i++){
    temp=arr[i];
    j=i-1;

    while((temp<arr[i])&&(j>=0)){
      arr[j+1]=arr[j];
      j--;
    }
    arr[j+1]=temp;
  }
}