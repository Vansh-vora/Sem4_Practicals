//Write a C program to create a tree and search an element from tree
#include<iostream>
using namespace std;

class node{
  public:
  int data;
  node *left;
  node *right;
};

node *tree=NULL;

node *insert(node *tree)
{
  int val;
  cout<<"\n enter the value(-1 to stop):";
  cin>>val;

  while(val!=-1)
  {
    node *ptr,*nodeptr,*parentptr;
    ptr=new node();
    ptr->data=val;
    ptr->left=ptr->right=NULL;

    if(tree==NULL)
    {
      tree=ptr;
    }
    else{
      parentptr=NULL;
      nodeptr=tree;

        while(nodeptr!=NULL)
        {
          parentptr=nodeptr;

          if(val<nodeptr->data)
          {
            nodeptr=nodeptr->left;
          }
          else{
            nodeptr=nodeptr->right;
          }
        }
        if(val<parentptr->data)
        {
          parentptr->left=ptr;
        }
        else{
          parentptr->right=ptr;
        }
    }
    cout<<"\n Enter value:";
    cin>>val;
  }
  return tree;
}

int search(int item,node *tree)
{
  while (tree!=NULL)
  {
    if(tree->data==item)
    {
      return 1;
    }
    else if(item<tree->data){
      tree=tree->left;
    }
    else{
      tree=tree->right;
    }
  }
  return 0;
}
int main()
{
  int choice,item,flag=0;
  cout<<"\n1.Insert \n2.Search\nExit\n";

  do
  {
    cout<<"\n Enter choice:";
    cin>>choice;

    switch(choice)
    {
      case 1:
        tree=insert(tree);
        break;
      case 2:
        cout<<"\n enter value to search:";
        cin>>item;
        flag=search(item,tree);
        if(flag==0)
        {
          cout<<"\n Element not found";
        }
        else{
          cout<<"\n Element found";
        }
        break;
      case 3:
        exit(0);
      default:
        cout<<"\n Enter correct choice!";
    }
  } while (choice !=3);

  return 0;
}
