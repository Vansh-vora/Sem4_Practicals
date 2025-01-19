//Write a CPP program to create a class named Student with data : No, Name and 
//Addresss.
//Create 3 objects of Student structure. Get the value of structure variable from user and 
//print it.
#include<iostream>
using namespace std;

class Student{
    public:
    int number;
    string name;
    string Address;
};
int main(){
    int num;

    cout<<"\n enter the number of Students:";
    cin>>num;

    Student stu[num];

    cout<<"\n Provide info of Students:";
    for(int i=0;i<num;i++){
        cout<<"\n Enter the name of Student "<<i+1<<":";
        cin>>stu[i].name;
        cout<<"\n Enter the Number of Student "<<i+1<<":";
        cin>>stu[i].number;
        cout<<"\n Enter the Address of Student "<<i+1<<":";
        cin>>stu[i].Address;

    }

    cout<<"\n The details of Student are:";
    for(int i=0;i<num;i++){
        cout<<"\n";
        cout<<"\n  name of Student "<<i+1<<":"<<stu[i].name;
        cout<<"\n  number of Student "<<i+1<<":"<<stu[i].number;
        cout<<"\n  Address of Studnet "<<i+1<<":"<<stu[i].Address;
        cout<<"\n";
    }
    cout<<"\n";
    return 0;
}