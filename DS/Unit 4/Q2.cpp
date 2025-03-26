//Write a C program to create a tree and perform Inorder on it.
#include<iostream>
using namespace std;

class node
{
  public:
  int data;
  node *left;
  node *right;

};
node *tree=NULL;

node *insert(node *tree)
{
  int val;
  cout<<"\n Enter the value(-1 to stop):";
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

      if(nodeptr!=NULL)
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
 void inorder(node *tree){
  if(tree!=NULL){
    inorder(tree->left);
    cout<<tree->data<<" ";
    inorder(tree->right);
  }
}
int main(){
  int choice;
  cout<<"\n1.insert\n2.Inorder\n3.exit\n";

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
    cout<<"\n Inorder Tranversal";
    inorder(tree);
    break;
    case 3:
      exit(0);
      break;
    default:
      cout<<"\n enter a correct choice";
      break;
    }
  } while (choice!=3);
  
}
