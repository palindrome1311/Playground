  
#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m;
  cin>>n;
  int arr[m][n],i,j,sum=0;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(i=0;i<n-1;i++)
    sum+=arr[0][i];
  for(i=1;i<n;i++)
    sum+=arr[m-1][i];
 // cout<<"sum";
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      if((i+j)==(n-1))
        sum+=arr[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
 
    
 
  
}
