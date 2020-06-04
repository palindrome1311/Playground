
#include <iostream> 
#include <string> 
using namespace std; 
  int main() 
{ 
    string str; 
    getline(cin,str); 
    int i=0,digit=0,whitespace=0,vowel=0,consonant=0,symbol=0;
    for(i=0;str[i]!='\0';i++)
    {
    	if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'||
		str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
		vowel++;
		else if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z'))
         consonant++;
		else if(str[i]>='0' && str[i]<='9')
		digit++;
		else if(str[i]==' ')
		whitespace++;
		else
		symbol++;    	
	}
	cout<<"Vowels:"<<vowel<<"\n";
	cout<<"Consonants:"<<consonant<<"\n";
	cout<<"White Spaces:"<<whitespace<<"\n";
	cout<<"Digits:"<<digit<<"\n";
	cout<<"Symbols:"<<symbol;

}
