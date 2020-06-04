#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2;
  cin>>str1>>str2;
  int f=1,n=str1.length();
  	 for(int i=0;i<=str1.length()||i<=str2.length();i++)
  	 {
  	 	if(str1[i]!=str2[n-i-1])
  	 	{
		f=0;
		break;
		}
	 }
 if(f && str1.length()==str2.length())
  cout<<"It is correct";
  else
  cout<<"It is wrong";
  
 
}
