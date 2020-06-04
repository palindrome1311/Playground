#include <iostream>

using namespace std;



int main(void)

{

  int target, score, attempt=0, sum=0;

  cin>>target;

  while(sum<target)

  {

    cin>>score;

    sum=sum+score;

    attempt++;

  }

  cout<<"The number of turns is "<<attempt<<"\n";

}
