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
    
  }
  cout<<"Sum of rows is ";
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
   sumr+=arr[i][j];
   }
    if(sumr>max)
    {  
      max=sumr;
      r=i;
    }
    cout<<sumr<<" ";
    sumr=0;
  
  }
  cout<<"\nRow "<<r+1<<" has maximum sum";
  
  c=0;
  max=0;
  
  cout<<"\nSum of columns is ";
  for(i=0;i<n;i++)
  {
   for(j=0;j<m;j++)
   {
   sumc+=arr[j][i];
   }
    if(sumc>max)
    {  
      max=sumc;
      c=i;
    }
    cout<<sumc<<" ";
    sumc=0;
  
  }
  cout<<"\nColumn "<<c+1<<" has maximum sum";
}
