#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d%d",&n,&m);
  int a[n],b[m],i,j,x,k;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
    for(j=0;j<m;j++)
  {
    scanf("%d",&b[j]);   
  }
  for(k=0;k<n && x;k++)
  {
    if(a[k]==b[k])
      x=1;
    else
      x=0;
  }
  if(x==0)
    printf("Not Same");
    else
      printf("Same");
}