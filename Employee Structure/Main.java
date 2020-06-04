#include<iostream>
#include<stdio.h>
using namespace std;
struct employee{
  char name[100];
  int id;
  int age;
  char designation[100];
  float salary;
 }s1;

int main()
{
  cout<<"Enter name:"<<"\n";
  cin>>s1.name;
  cout<<"Enter ID:"<<"\n";
  cin>>s1.id;
  cout<<"Enter age:"<<"\n";
  cin>>s1.age;
  cout<<"Enter designation:"<<"\n";
  cin>>s1.designation;
  cout<<"Enter Salary:"<<"\n";
  cin>>s1.salary;
  cout<<"Employee Details"<<"\n";
  cout<<"Name of the Employee : "<<s1.name<<"\n";
  cout<<"ID of the Employee : "<<s1.id<<"\n";
  cout<<"Age of the Employee : "<<s1.age<<"\n";
  cout<<"Designation of the Employee : "<<s1.designation<<"\n";
  cout<<"Salary of the Employee : "<<s1.salary<<"\n";

}
