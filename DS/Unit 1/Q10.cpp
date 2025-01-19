// Write a CPP program to sum all the diagonal element.
#include<iostream>
using namespace std;

int sumDiagonal(int mat[][5]){
    int sum=0;
    for(int i=0;i<5;i++){
        sum +=mat[i][i];
        if(i!=5-1-i){
            sum+=mat[i][5-1-i];
        }
        
    }
    return sum;
}
int main(){
    int mat[5][5]={{1,0,0,0,5},
                   {0,2,0,4,0},
                   {0,0,3,0,0},
                   {0,2,0,4,0},
                   {1,0,0,0,5}};

    cout<<"\n The sum all the diagonal element:"<<sumDiagonal(mat);

    cout<<"\n";
    return 0;
}