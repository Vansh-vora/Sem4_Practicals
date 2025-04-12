#include<iostream>
using namespace std;
int main(){
  int ar[100],no,i=0,num,pos=-1;

  cout<<"\n enter the size of array:";
  cin>>no;

  for(i=0;i<no;i++){
    cout<<"\n enter the no:";
    cin>>ar[i];
  }
  cout<<"\n enter the number to be search";
  cin>>num;

  for(i=0;i<no;i++)
  {
    if(ar[i]==num)
    {
      pos=i;
      cout<<"Found";
      break;
    }
  }
  if(pos==-1){
    cout<<"\n Not found";
  }
  return 0;
}