#include<iostream>

using namespace std;

int main()

{

  int n,i,j=6,sum=5;

  cin>>n;

  for (i=1;i<=n;i++)

  {

    cout<<j<<" ";

    j=j+sum;

    sum=sum+5;  

  }

  return 0;

}