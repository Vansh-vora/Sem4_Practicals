// Write a C Program to create a stack using a Linkedlist.
#include<iostream>
using namespace std;

class Node{
  public:
  int data;
  Node *next;

};

Node *top=NULL;

Node *push(Node *top){
  int val;

  cout<<"\n Enter the value to put in a stack:";
  cin>>val;

  Node *newnode=new Node();
  newnode->data=val;

  if(top==NULL){
    newnode->next=NULL;
    top=newnode;
  }
  else{
    newnode->next=top;
    top=newnode;
  }
  return top;
}
void display(Node *top){
  Node *ptr=top;

  cout<<"\n the current stack is:";
  while(ptr!=NULL){
    cout<<ptr->data<<" ";
    ptr=ptr->next;
  }
  cout<<"\n";
}
int main(){
  top=push(top);
  top=push(top);
  top=push(top);
  top=push(top);

  display(top);

  cout<<"\n";
  return 0;
}