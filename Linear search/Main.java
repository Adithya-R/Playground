#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,target;
  for(i=0;i<n;i++)
  {
   	scanf("%d",&a[i]);
  }
  scanf("%d",&target);
   for(i=0;i<n;i++)
  {
   	if (target==a[i])
    {
      printf("%d is present at location %d",target,i+1);
      break;
    }
  }
  if(i==n)
    printf("Element not found");
  
  return 0;
}