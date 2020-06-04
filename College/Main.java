#include<iostream>
using namespace std;
struct student{
char name[100];
  char city[100];
  int year;
  float pp;

};
int main()
{
  int n;
  cout<<"Enter the number of colleges"<<"\n";
  cin>>n;
  struct student s1[100];
  for(int i=1;i<=n;i++)
  {
  cout<<"Enter the details of college "<<i<<"\n";
    cout<<"Enter name"<<"\n";
    cin>>s1[i].name;
    cout<<"Enter city"<<"\n";
    cin>>s1[i].city;
    cout<<"Enter year of establishment"<<"\n";
    cin>>s1[i].year;
    cout<<"Enter pass percentage"<<"\n";
    cin>>s1[i].pp;}
    cout<<"Details of colleges"<<"\n";
  for(int i=1;i<=n;i++)
  {
    cout<<"College:"<<i<<"\n";
    cout<<"Name:"<<s1[i].name<<"\n";
    cout<<"City:"<<s1[i].city<<"\n";
    cout<<"Year of establishment:"<<s1[i].year<<"\n";
    cout<<"Pass percentage:"<<s1[i].pp<<"\n";}
   }
