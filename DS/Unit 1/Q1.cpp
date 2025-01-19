//Write a CPP program to create a matrix and check whether that matrix is Sparse matrix or
//not.
#include<iostream>
using namespace std;

int main(){
    int counter=0;
    int rows;
    int cols;
    cout<<"\n enter the no of rows you want:";
    cin>>rows;
    cout<<"\n enter the no of column you want:";
    cin>>cols;

    int mat[rows][cols];
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cout<<"\n Enter the value of array"<<i+1<<","<<j+1<<":";    
            cin>>mat[i][j];
        }
        cout<<"\n";
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cout<<mat[i][j]<<" ";
        }
        cout<<"\n";
    }
    //Sparse Matrix
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++)
        {
            if(mat[i][j]==0){
                counter++;
            }
        }
    }
    if(counter> (rows*cols) /2){
        cout<<"\n This matrix is Sparse Matrix";
    }
    else{
        cout<<"\n This matrix is not a Sparse Matrix";
    }
    cout<<"\n";
    return 0;

}