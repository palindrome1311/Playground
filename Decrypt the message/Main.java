#include<iostream>
int main()
{
int a,b,num,i,div,sum=0;
std::cin>>a>>b;
num=a+b;
for(i=1;i<num;i++)
{
div=num%i;
if(div==0)
sum=sum+i;
}
if(sum==num)
std::cout<<"They can read the message";
else
std::cout<<"They can't read the message";
return 0;
}