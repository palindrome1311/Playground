
#include <iostream> 
#include <string> 
using namespace std; 
  int main() 
{ 
    string str,word="",result="";
	int i,j; 
    getline(cin,str); 
    for(int i=0;str[i]!='\0';i++)
    {
    	if(str[i]==' ')
    	{
    	if(word!="the")
    	result=result+word+" ";
			word="";
		}
		else
		word+=str[i];
	}
        if(word!="the")
    	result=result+word+" ";
	cout<<result;

    
    

}
