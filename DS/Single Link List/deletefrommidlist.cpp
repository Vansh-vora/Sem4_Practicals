#include<iostream>
using namespace std;

class node{
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
    cout<<"\n enter -1 to end the entering data:";
    cin>>number;

    while (number!=-1)
    {
        newNode=new node();
        newNode->data=number;
        newNode->next=NULL;
        if(start==NULL)
        {
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
node *deletenodefrommid(node *ptr,int index)
{
    node *start=ptr;
    node *preptr;
    int count=0;
    while(ptr!=NULL)
    {
        if(count==index)
        {
            preptr->next=ptr->next;
            break;
        }
        preptr=ptr;
        ptr=ptr->next;
        count++;
    }
    return start;
}
void viewlinklist(node *ptr)
{
    if(ptr==NULL)
    {
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
    viewlinklist(start);
    cout<<"\nenter the index you want to delete:";
    int index;
    cin>>index;
    start=deletenodefrommid(start,index);
    viewlinklist(start);
    return 0;
}