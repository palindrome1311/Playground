#include<cstdio>

int fib (int);

int main ()

{

  int n, result;

  scanf ("%d", &n);

  result = fib (n - 1);

  printf ("The term %d in the fibonacci series is %d\n", n, result);

  return 0;

}


int fib (int n)

{

  if (n == 0)

  {

    return 0;

  }

  else if (n == 1)

  {

    return 1;

  }

  else

  {

    return (fib (n - 1) + fib (n - 2));

  }

}
