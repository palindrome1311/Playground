#include<stdlib.h>
#include<iostream>
using namespace std;
void print(int n)
{
  if(n)
  {
   cout<<"Invalid Input";
    exit(0);
  }

}
using namespace std;
int main()
{
int arr[20];
  int i,n,loc,val;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  print(cin.fail());
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
    print(cin.fail());  
  }
    cout<<"Enter the location where you wish to insert an element\n";
    cin>>loc;
  print(cin.fail());
  if(loc<=n)
  {
     print(cin.fail());
    cout<<"Enter the value to insert\n";
     cin>>val;
     print(cin.fail());
  
  for(i=n;i>=loc;i--)
  {
  arr[i]=arr[i-1];
  }
  arr[i]=val;
  cout<<"Array after insertion is\n";
  for(i=0;i<=n;i++)
  cout<<arr[i]<<"\n";
    
  }
  else
  {
  cout<<"Invalid Input";
    exit(0);
  }
   
  
 
  
}
