#include<iostream>

using namespace std;

int power(int x,int y)

{

  if(y!=0)

    return (x*power(x,y-1));

  else

  {

    return 1;

  }

}

int main()

{

  int a,b;

  cin>>a>>b;

  cout<<"Enter the value of a"<<"\n"<<"Enter the value of n"<<"\n";

  cout<<"The value of "<<a << " power "<<b <<" is "<<power(a,b);



}