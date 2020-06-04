#include<iostream>

int main()

{

  int n,j;

  std::cin>>n;

  for(int I=1; I<=n; I++)

  {

    for( j=1; j<=I; j++)

      if (j<I)

      {

        std::cout<<I<<"*";}



    else

    {

      std::cout<< I<<"\n";

    }

  }

  for(int I=n; I>=0; I--)

  {

    for( j=1; j<=I; j++)

      if (j<I)

        std::cout<< I<<"*";

    else

      std::cout<< I<<"\n";

  }

}