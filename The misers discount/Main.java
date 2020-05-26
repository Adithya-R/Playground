#include<stdio.h>
int main()
{
  float a,b,r,i;
  scanf("%f%f%f",&a,&b,&r);
  i=(a+b)*r/100;
  printf("%.2f\n%.2f\n%.2f",a+b,a+b-i,i);
}