//Write a CPP program to create a Matrix and print Upper Triangular

#include<iostream>
using namespace std;

int main(){
    int arr[5][5]={{1,2,3,4,5},
                   {0,2,3,4,5},
                   {0,0,3,4,5},
                   {0,0,0,4,5},
                   {0,0,0,0,5}};

cout<<"\n Upper Triangular Matrix\n";
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(j-i>=0){
                cout<<arr[i][j]<<" ";
            }
            else{
                cout<<"  ";
            }
        }
        cout<<"\n";
    }
    cout<<"\n";
    return 0;
}