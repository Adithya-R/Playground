#include <stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node *next;
};
void append(struct node  **headadd,int data);
void display(struct node *head);
int main()
{
  struct node *head=NULL;
  int data;
  do
  {
    scanf("%d",&data);
    if(data>0)
      append(&head,data);
   // printf("%d\n",data);
  }while(data>0);
 
  display(head);
  }
  void append(struct node **headadd,int data)
  {
    struct node *temp,*newnode;
    temp=*headadd;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->next=NULL;
    if(*headadd==NULL)
      *headadd=newnode;
    else{
      while(temp->next!=NULL){
        temp=temp->next;  
  }
      temp->next=newnode;
}
  }
void display(struct node *head)
{
   int c=0,i,j,a[20],t;
  while(head!=NULL)
  {
    a[i]=head->data;
    i++;
    c++; 
    head = head->next;
}
  for(i=0;i<c-1;i++)
  {
  for(j=i+1;j<c;j++)
  {
    if(a[i]>a[j])
    {
      t=a[i];
      a[i]=a[j];
      a[j]=t;
    }
  }
  }
  printf("The students are seated in the order: ");
  for(i=0;i<c;i++)
  {
    printf("%d ",a[i]);
  }
}

