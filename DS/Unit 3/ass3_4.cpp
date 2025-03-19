// Write a C Program to create a queue using Linkedlist.
#include<iostream>
using namespace std;

class Node{
  public:
  int data;
  Node *next;
};
Node *front=NULL;
Node *rear=NULL;

Node *enqueue(Node *front){
  int num;
  cout<<"\n Enter a number:";
  cin>>num;

  Node *newnode=new Node();
  newnode->data=num;
  newnode->next=NULL;

  if(front==NULL){
    front=rear=newnode;

  }
  else{
    rear->next=newnode;
    rear=newnode;
  }
  return front;

}
void display(){
  Node *ptr=front;

  while(ptr!=NULL){
    cout<<ptr->data<<" ";
    ptr=ptr->next;
  }
}
int main(){
  front=enqueue(front);
  front=enqueue(front);
  front=enqueue(front);
  front=enqueue(front);
  display();
  cout<<"\n";
  return 0;
}
