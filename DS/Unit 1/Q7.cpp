//Write a CPP program to create a matrix and check whether that matrix is diagnol matrix 
//or not.

#include<iostream>
using namespace std;

int main(){
    int rows,cols;
    cout<<"\n Enter no of rows you want:";
    cin>>rows;
    cout<<"\n Enter no of cols you want:";
    cin>>cols;

    int arr[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cout<<"\n Enter the value for Arr["<<i+1<<"]["<<j+1<<"]:";
            cin>>arr[i][j];
        }
        cout<<"\n";
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<"\n";
    }

    cout<<"\n The Matrix is Diagonal or Not";
            for(int i=0;i<rows;i++){

                for(int j=0;j<cols;j++){
                    if(i!=j && arr[i][j]!=0){
                        cout<<"\n It is Not diagonal";
                    }
                    else{
                        cout<<"\n It is Diagonal";
                    }
                }
            }
        
            
        
    
    cout<<"\n";
    return 0;
}