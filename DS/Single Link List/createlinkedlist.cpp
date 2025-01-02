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
    cout<<"\n enter -1 to end entering data!!";
    cout<<"Enter data:";
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
        cin>>number;
    }
    return start;
}
void display(node *ptr)
{
    if(ptr==NULL)
    {
        cout<<"\n Node is empty";
    }
    int index=0;
    while(ptr !=NULL)
    {
        cout<< "node"<<index++<<"::"<<ptr->data<<"\n";
        ptr=ptr->next;
    }
    cout<<"\n";
}
int main()
{
    node *start=createList();
    display(start);
    return 0;
}