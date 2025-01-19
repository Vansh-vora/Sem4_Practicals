//Write a CPP program to create two dimensional array, pass that array to a user defined 
//function and print it.
#include<iostream>
using namespace std;

void display(int arr[][3],int row,int col){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<"\n";
    }
}
int main(){
    int arr[3][3]= {{1,2,3}, {4,5,6}, {7,8,9}};

    display(arr,3,3);
    cout<<"\n";
    return 0;
}