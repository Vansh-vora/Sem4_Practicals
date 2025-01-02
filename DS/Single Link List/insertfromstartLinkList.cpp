#include<iostream>
using namespace std;

class node
{
    public:
    int data;
    node *next;

};

node *createList()
{
    node *start=NULL;
    node *rear=NULL;
    node *newNode;
    int number;
    cout<<"\n enter -1 to end entering data:";
    cout<<"\n enter the data:";
    cin>>number;
    while(number!=-1)
    {
       newNode=new node();
       newNode->data=number;
       newNode->next=NULL;
       if(start==NULL){
        start=newNode;
        rear=newNode;

       }
       else{
        rear->next=newNode;
        rear=newNode;
       }
       cin>>number;
    }
    return start;
}
node *insertnodefromstart(node *ptr,int value)
{
    node *newNode=new node();
    newNode->next=ptr;
    newNode->data=value;
    return newNode;
}

void viewLinkList(node *ptr)
{
    if(ptr==NULL){
        cout<<"\n Node is empty";
    }
    int index=0;
    while(ptr!=NULL)
    {
        cout<<"node"<<index++<<"::"<<ptr->data<<"\n";
        ptr=ptr->next;
    }
    cout<<"\n";
}
int main()
{
    node *start=createList();
    viewLinkList(start);
    cout<<"\nEnter value for inserting starting node:";
    int value;
    cin>>value;
    start=insertnodefromstart(start,value);
    viewLinkList(start);
    return 0;
}