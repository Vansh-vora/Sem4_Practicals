#include<iostream>
using namespace std;

int main(){
  int i,j,temp;
  int a[10]={10,9,7,101,23,45,67,76,46,70};
  for(i=0;i<9;i++)
  {
    for(j=0;j<9-i;j++)
    {
      if(a[j]>a[j+1])//a[0]>a[0+1]
      {
        temp=a[j];//temp=a[0]
        a[j]=a[j+1];//a[0]=a[1]
        a[j+1]=temp;//a[1]=temp
      }
    }
  }
  cout<<"\nPrinting Sorted Element List\n";
  for(i=0;i<10;i++){
    cout<<a[i]<<" ";
  }
  cout<<"\n";
  return 0;
}