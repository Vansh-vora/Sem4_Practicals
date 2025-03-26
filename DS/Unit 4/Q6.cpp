// Write a C program to create a tree and find maximum value of it.
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
  cout<<"\n Enter a value(-1 to stop):";
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
              nodeptr-nodeptr->left;

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
      cout<<"\n enter the value:";
      cin>>val;
    }
    return 0;
}

int max(node *tree)
{
  if(tree==NULL)
  {
    return 0;
  }
  int lmax=max(tree->left);
  int rmax=max(tree->right);
  int dmax=tree->data;

  if(lmax>dmax)
  {
    dmax=lmax;
  }
  if(rmax>dmax)
  {
    dmax=rmax;
  }
  return dmax;
}
int main()
{
  int choice,m;
  cout<<"\n 1.Insert\n2.Find Maximum\n3.Exit";

  do
  {
    cout<<"\n Enter a choice:";
    cin>>choice;

    switch (choice)
    {
    case 1:
      tree=insert(tree);
      break;
    case 2:
      m=max(tree);
      cout<<"\n Maximum value:"<<m;
      break;
    case 3:
      exit(0);
    default:
      cout<<"\n enter correct choice";
      break;
    }
  } while (choice!=3);
  
}