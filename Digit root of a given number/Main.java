#include<bits/stdc++.h> 
using namespace std; 
  
// Returns digital root of num 
int digitalRoot(string num) 
{ 
    // If num is 0. 
    if (num.compare("0") == 0) 
        return 0; 
  
    // Count sum of digits under mod 9 
    int ans = 0; 
    for (int i=0; i<num.length(); i++) 
        ans = (ans + num[i]-'0') % 9; 
  
    // If digit sum is multiple of 9, answer 
    // 9, else remainder with 9. 
    return (ans == 0)? 9 : ans % 9; 
} 
  
// Driver code 
int main() 
{ 
    string num;
  	cin>>num;
    cout<< digitalRoot(num) <<endl; 
  
    return 0; 
} 