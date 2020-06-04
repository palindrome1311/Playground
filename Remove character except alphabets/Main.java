#include<iostream>
#include<string>
using namespace std;
int main()
{
	string str1,result;
	cin>>str1;
	for(int i=0;i<=str1.length();i++)
	{
		if((str1[i]>='a'&str1[i]<='z')  ||  (str1[i]>='A'&str1[i]<='Z'))
		result+=str1[i];
	}
	cout<<result;
}
