#include<iostream>
using namespace std;

int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cout<<"Enter the elements in the array"<<endl;
  cin >> n;
  int arr[n];
  for(int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  int i;
  int odd = 0, even = 0;
  for(i = 0; i < n; i++)
  {
    if(arr[i] % 2 == 1)
      odd++;
    if(arr[i] % 2 == 0)
      even++;
  }
  if(odd == n)
    cout << "The array is Odd";
  else if(even == n)
    cout << "The array is Even";
  else
    cout << "The array is Mixed";
  return 0;
}