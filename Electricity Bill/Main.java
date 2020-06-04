#include<iostream>

using namespace std;

int main()

{

  int unit;

  int amt;

  cin>>unit;

  if(unit<=200)

    amt = unit*0.5;

  if(unit>200 && unit<=400)

    amt = amt + (unit-200)*0.65 + 100;

  if(unit>400 && unit<=600)

    amt = amt + (unit-400)*0.80 + 200;

  if(unit>600)

    amt = amt + (unit-600)*1.25 + 425;

  cout<<"Rs."<<amt;
}