#include<iostream>
using namespace std;
int main()
{
 int m,n;
  cin>>m;
  cin>>n;
  int i,j,arr[m][n];
  int sumr=0,sumc=0,max=0,r,c;
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
   cin>>arr[i][j];
   }
   //out<<"\n";
  }
  for(i=0;i<n;i++)
  {
        max=0;
   for(j=0;j<m;j++)
   {
   if(max<arr[j][i])
     max=arr[j][i];
   }
    cout<<max<<"\n";

  
  }
  
}
