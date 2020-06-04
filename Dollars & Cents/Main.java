#include<iostream>
using namespace std;
int main()
{
int dollar, cent, dollar1, cent1;
cin>>dollar>>cent>>dollar1>>cent1;
int Totaldollar=dollar+dollar1;
int Totalcent=cent+cent1;
while(Totalcent>100)
{
Totalcent=Totalcent-100;
Totaldollar=Totaldollar+1;
break;
}
cout<<Totaldollar<<"\n"<<Totalcent;
return 0;
}
