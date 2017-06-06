#include<stdio.h>
#include<conio.h>
void main()
{
int a,rev;
printf("enter the no");
scanf("%d",&a);
while(a!=0)
{
rev=a%10;
printf("%d",rev);
a=a/10;
}
getch();
}
