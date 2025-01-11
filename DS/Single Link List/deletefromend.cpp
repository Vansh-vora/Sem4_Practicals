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

    while(number!=-1)
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
node *deletenodefromend(node *ptr)
{
    node *start=ptr;
    node *preptr;

    while(ptr!=NULL)
    {
        if(ptr->next=NULL)
        {
            preptr->next=NULL;
            break;
        }
        preptr=ptr;
        ptr=ptr->next;
    }
    return start;
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
    start=deletenodefromend(start);
    viewLinkList(start);
    return 0;
}