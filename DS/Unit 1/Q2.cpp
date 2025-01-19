//Write a CPP program to create a single dimensional array, pass that array to a user 
//defined function and print it
#include<iostream>
using namespace std;

void display(int arr[],int size){
    for(int i=0;i<size;i++){
        cout<<"Arr["<<i<<"]:"<<arr[i]<<"\n";
    }
}
int main(){
    int arr[3]={1,2,3};
    int size=sizeof(arr)/sizeof(int);
   
      display(arr,size);
    cout<<"\n";
    return 0;
}