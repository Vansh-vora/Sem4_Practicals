//Write a CPP program to create a Matrix and print Lower Triangular.
#include<iostream>
using namespace std;

int main(){
    int arr[5][5]={{1,0,0,0,0},
                   {1,2,0,0,0},
                   {1,2,3,0,0},
                   {1,2,3,4,0},
                   {1,2,3,4,5}};
    
    cout<<"\n Lower Triangular Matrix";
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(i-j>=0){
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