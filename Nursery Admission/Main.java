#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1;
  cin>>str1;
  int l;
  for(l=0;str1[l]!='\0';l++);
  cout<<"The number of letters in the name is "<<l;
}
