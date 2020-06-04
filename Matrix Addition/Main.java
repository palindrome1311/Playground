#include<iostream>
using namespace std;
int main()
{
 int m,n;
  cin>>m>>n;
  int arr1[m][n],arr2[m][n],i,j;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      cin>>arr1[i][j];
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      cin>>arr2[i][j];
  }
   for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
      cout<<arr1[i][j]+arr2[i][j]<<" ";
     cout<<"\n";
  }
 
 
  
 

}
