#include<stdio.h>

int main()

{

  int n,n1,sum=0,sum1=0;

  scanf("%d",&n);

  while(n>0)

  {

    n1=n%10;

    if (n1%2==0)

    {

      sum=sum+n1;

    }

    else

    {

      sum1=sum1+n1;

    }

    n=n/10;

  }

  if(sum==sum1)

  {

    printf("Yes");

  }

  else

    printf("No");

  return 0;

}