//Write a CPP program to represent sparse matrix in Triplet Representation
#include<iostream>
using namespace std;

int main(){
    int rows,cols;
    cout<<"\n enter the no of rows you want:";
    cin>>rows;
    cout<<"\n Enter the no of column you want:";
    cin>>cols;

    int count = 0;
    int arr[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            cout<<"\n enter the value of arr["<<i+1<<"] ["<<j+1<<"]:";
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
    //Sparse Matrix

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(arr[i][j]==0){
                count++;
            }
        }
    }
    cout<<"\n In Representation\n";
    if(count>(rows*cols)/2){
        int nonZero=(rows*cols)-count;
        int nonZeroMat[3][nonZero];

        int k=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]!=0){
                    nonZeroMat[0][k]=i;
                    nonZeroMat[1][k]=j;
                    nonZeroMat[2][k]=arr[i][j];
                    k++;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<nonZero;j++){
                cout<<nonZeroMat[i][j]<<" ";
            }
            cout<<"\n";
        }
    }
    cout<<"\n";
    return 0;
}