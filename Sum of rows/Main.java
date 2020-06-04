#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>n;
  cin>>m;
  int arr[m][n],i,j,sum=0;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
     cin>>arr[i][j];
    }
  }
  for(i=0;i<m;i++)
  {
    sum=0;
    for(j=0;j<n;j++)
    {
     sum+=arr[i][j];
    }
    cout<<sum<<"\n";
  }
  
  
}
