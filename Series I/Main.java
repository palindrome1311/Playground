#include <iostream>

#include <cmath>

int main()

{

  int n;

  std::cin>>n;

  double r=0.5;

  for(int i=0;i<n;i++)

  {

    if(i==0)

    {

      std::cout<<r;

      continue;

    }

    else

    {

      double t=pow(3,i-1);

      double x=t+r;

      r=x;

      std::cout<<" "<<x;

    }

  }

}