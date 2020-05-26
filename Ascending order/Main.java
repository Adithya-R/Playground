#include<stdio.h>
int main()
{
  int n,i,j,k,l,temp;
  scanf("%d",&n);
  int a[n];
    for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(j=0;j<n-1;j++)
  {
    for(k=j+1;k<n;k++)
    {
      if(a[j]>a[k])
      {
        temp=a[j];
        a[j]=a[k];
        a[k]=temp;
      }
    }
  }
  printf("Sorted array is:\n");
  for(l=0;l<n;l++)
  {
    printf("%d\n",a[l]);
  }
}