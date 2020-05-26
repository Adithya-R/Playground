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
  int low=0,high=n-1,mid;
  mid=(low+high)/2;
  	while(low<=high)
    {
      if(a[mid]==target)
      {
        printf("%d found at location %d.",a[mid],mid+1);
      	break;
      }
      else if (a[mid]>target)
      {
        high=mid-1;
      	mid=(low+high)/2;
      }
      else if (a[mid]<target)
      {
        low=mid+1;
      mid=(low+high)/2;
      }
    }
 if(a[mid]!=target)
    printf("Not found");

 
 return 0;
}