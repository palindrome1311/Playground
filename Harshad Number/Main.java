#include<bits/stdc++.h>
using namespace std;
bool chkHarshad(int n)
{
    int s = 0;
	int tmp;
    for (tmp=n; tmp>0; tmp /= 10)
        s += tmp % 10;
    return (n%s == 0);
}
int main()
{
int hdno;
cin >> hdno;
if(chkHarshad(hdno))
cout << "Harshad Number"<<endl;
else
cout <<"Not Harshad Number"<<endl;
return 0;
}