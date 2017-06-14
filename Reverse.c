#include<stdio.h>
#include<conio.h>
void main()
{
int a,rev;
clrscr();
printf("enter the no");
Scanf("%d",&a);
while(a!=0)
{
rev=a%10;
printf("\n%d",rev);
a=a/10;
}
getch();
}
