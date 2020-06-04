#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m;
  cin>>n;
  int arr[m][n],max=0,i,j;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      cin>>arr[i][j];
  }
  for(i=0;i<m;i++)
  {
    max=0;
   for(j=0;j<n;j++)
   {
   if(max<arr[i][j])
     max=arr[i][j];
   }
    cout<<max<<"\n";
    
  }
}
