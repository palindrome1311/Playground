#include<iostream>
#include<string>
using namespace std;
int isPresent(string str[20],string str1,int n)
{
	for(int i=0;i<n;i++)
	{
		if(str1==str[i])
		{
			return 1;
		}
	}
	return 0;
	
}
int main()
{
  
  string str[20];
  int n,i;
  for(n=0;;n++)
  {
  cin>>str[n];
  if(str[n]=="####")
  break;
  }
  for(i=0;i<n;i++)
  {
  	int l=str[i].length();
  	if(str[i][l-1]==str[i+1][0] &&(!isPresent(str,str[i+1],i+1)))
  	cout<<str[i]<<"\n";
  	else
  	break;
  	
  }
  cout<<str[i];
  

 
}

