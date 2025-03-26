//Write a C program to create a tree and perform Preorder on it.
#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node *left;
    node *right;

};

node *tree=NULL;

node *insert(node *tree){
    int val;

        for(int i=0;i<6;i++)
        {
            cout<<"\n Enter the value:";
            cin>>val;
            node *ptr,*nodeptr,*parentptr;
            ptr=new node();
            ptr->data=val;

            if(tree==NULL)
            {
                tree=ptr;
                tree->left=NULL;
                tree->right=NULL;
            }
            else{
                parentptr=NULL;
                nodeptr=tree;

                while(nodeptr!=NULL){
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
            
        }
        return tree;
}

void preorder(node *tree){
    if(tree!=NULL)
    {
        cout<<tree->data<<" ";
        preorder(tree->left);
        preorder(tree->right);
    }
}
int main(){
    cout<<"\n Insert 6 values into the tree:";
    tree=insert(tree);

    cout<<"\n Preorder tranversal";
    preorder(tree);
    cout<<"\n";
    return 0;
}