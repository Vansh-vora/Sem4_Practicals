// Write a C Program to create a Stack using an array with 10 elements and find the ODD
// numbers out of it and print it.
#include <iostream>
using namespace std;
int stack[10],stacksize=10,top = -1;

void push(int val){
  if(top>stacksize-1){
    cout<<"The stack is overflowed";
  }
  else{
    top++;
    stack[top]=val;
  }
}

void display(){
  if(top<=-1){
    cout<<"\n The Stack is Empty";
  }
  else{
    cout<<"\n The Full stack is:";
    for(int i=0;i<=top;i++){
      cout<<stack[i]<<" ";
    }
    cout<<"\n";
  }
}
void oddnum(){
  if(top<=-1){
    cout<<"\n The stack is empty";

  }
  else{
    cout<<"\n The odd Number in stack are:";
    for(int i=0;i<=top;i++){
      if(stack[i]%2!=0){
        cout<<stack[i]<<" ";
      }      
    }
    cout<<"\n";
  }
}
int main(){
  int val;
  for(int i=0;i<10;i++){
    cout<<"\n Enter a value in stack:";
    cin>>val;
    push(val);
  }
  display();
  oddnum();

  cout<<"\n";
  return 0;
}
