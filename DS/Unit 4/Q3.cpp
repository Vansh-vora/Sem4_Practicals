//Write a C program to create a tree and perform Postorder on it.

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
    cout<<"\n enter the value:(-1 to stop):";
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
          while(nodeptr !=NULL)
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
        cout<<"\n enter the value:";
        cin>>val;
      }
      return tree;
}
void postorder(node *tree)
{
  if(tree!=NULL)
  {
    postorder(tree->left);
    postorder(tree->right);
    cout<<tree->data<<" ";
  }
}
int main()
{
  int choice;
  cout<<"\n1.insert\n2.Postorder\n3.Exit";

  do
  {
    cout<<"\n Enter the choice:";
    cin>>choice;

    switch (choice)
    {
    case 1:
      tree=insert(tree);
      break;
    case 2:
      cout<<"\n Postorder transversal\n";
      postorder(tree);
      break;
    case 3:
      exit(0);
    default:
      cout<<"\n Enter the correct choice";
      break;
    }
  } while (choice!=3);
  
  return 0;
}