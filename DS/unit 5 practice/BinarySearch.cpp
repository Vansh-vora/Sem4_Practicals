#include<iostream>
using namespace std;

int main(){
  int arr[5];
  int no;//array ni size mate
  int i=0;
  int num;//search karva mate 
  int n;
  int beg;
  int end;
  int mid;
  int found=0;

  cout<<"\n enter the size of array:";
  cin>>no;
  for(i=0;i<no;i++){
    cout<<"\n Enter a no:";
    cin>>arr[i];
  }
  cout<<"\n Enter a number to be search";
  cin>>num;//3
  beg=0;
  end=no-1;//5-1

  while(beg<=end){
    //0<=4
    mid=(beg+end)/2;//(0+4)/2=4/2=2 mid=2

    if(arr[mid]==num){
      //arr[2]==3
      cout<<num<<"is present in the array at position"<<mid+1;//2+1=3
      found=1;
      break;
    }
    else if(arr[mid]>num){
      //arr[2]>3
      end=mid-1;//2-1=1 end=1
    }
    else{
      beg=mid+1;//2+1=3 beg=3
    }
  }
  if(found==0){
    cout<<"not exist";
  }
  return 0;
}