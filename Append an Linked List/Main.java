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
  while(head!=NULL)
  {
   
    printf("%d\n",head->data);
  head = head->next;
}
}

