#include<stdio.h>
int main()
{
  int n,i,j,k;
  scanf("%d",&n);
  int a[n],b[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
    for(j=0;j<n;j++)
  {
    scanf("%d",&b[j]);
  }
    for(k=0;k<n;k++)
  {
    printf("%d ",a[k]+b[k]);
  }
}