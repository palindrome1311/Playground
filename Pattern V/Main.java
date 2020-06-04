#include<iostream>

using namespace std;

int main(){

int n,num=1,i=1,space=0,k=1;

cin>>n;

int number=n;

for(i=0;i<n;i++)

{

for(int j=1;j<=space;j++)

{

cout<<"-";

}

for(int m=1;m<2*n-space;m++)

{

if(m%2==0)

cout<<"*";

else

cout<<num++;

}

cout<<"*";

for(int l=1;l<2*n-space;l++)

{

if(l%2==0)

cout<<"*";

else

{

cout<<k+number*number;

k++;

}

}

number--;

space=space+2;

cout<<endl;

}

return 0;

}