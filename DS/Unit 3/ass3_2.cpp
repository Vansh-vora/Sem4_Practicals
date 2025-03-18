// Write a C Program to create a queue using an array and sort it.
#include <iostream>
using namespace std;

int queue[10],queuesize=10;
int front=-1,rear=-1;

void enqueue(int val){
  if(front>=queuesize-1){
    cout<<"\nQueue overflow";
  }
  else{
    if(front==-1 && rear==-1){
      front=rear=0;
      queue[rear]=val;
    }
    else{
      rear++;
      queue[rear]=val;
    }
  }
}
void sortqueue(){
  for(int i=front;i<=rear;i++){
    for(int j=i+1;j<=rear;j++){
      if(queue[i]>queue[j]){
        int temp=queue[i];
        queue[i]=queue[j];
        queue[j]=temp;
      }
    }
  }
}
void display(){
  if(front<=-1){
    cout<<"\n Queue overflow";
  }
  else{
    cout<<"\n The elements in queue are:";
    for(int i=front;i<=rear;i++){
      cout<<queue[i]<<" ";
    }
    cout<<"\n";
  }
}
int main(){
  enqueue(10);
  enqueue(30);
  enqueue(20);
  enqueue(50);
  enqueue(90);
  enqueue(40);

  cout<<"\nThe queue befroe sorting:";
  display();

  cout<<"\n The queue after sorting:";
  sortqueue();
  display();

  cout<<"\n";
  return 0;
}