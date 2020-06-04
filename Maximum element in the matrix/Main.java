#include<iostream>
using namespace std;
int main()
{
 int m,n;
  cin>>m;
  cin>>n;
  int i,j,arr[m][n];
  int max=0;
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
   cin>>arr[i][j];
   }
  }
  
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
    if(max<arr[i][j])
      max=arr[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}
