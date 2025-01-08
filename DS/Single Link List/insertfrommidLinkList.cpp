#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node *next;
};
node *createList(){
    node *start=NULL;
    node *rear=NULL;
    node *newNode;
    int number;
    cout<<"\n enter -1 to end entering data:";
    cin>>number;

    while(number!=-1){
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
node *insertnodefrommid(node *ptr,int index,int value)
{
    node *start=ptr;
    node *newNode=new node();
    newNode->data=value;
    int count=0;

    while(ptr!=NULL)
    {
        if(count==index)
        {
            node *postNode=ptr->next;
            ptr->next=newNode;
            newNode->next=postNode;
            break;
        }
        ptr=ptr->next;
        count ++;
    }
    return start;
}
void viewLinkList(node *ptr)
{
    if(ptr==NULL)
    {
        cout<<"\n NOde is empty";
    }
    int index=0;
    while(ptr!=NULL){
        cout<<"node"<<index++<<"::"<<ptr->data<<"\n";
        ptr=ptr->next;
    }
    cout<<"\n";
}
int main()
{
    node *start=createList();
    viewLinkList(start);
    int value;
    int index;
    cout<<"\n enter index for inserting starting node:";
    cin>>index;
    cout<<"\nenter value for inserting starting node:";
    cin>>value;
    start=insertnodefrommid(start,index,value);
    viewLinkList(start);

    cout<<"\n";
    return 0;
}