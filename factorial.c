#include<stdio.h>
#include<conio.h>
void main()
{
int num,i=1;
printf("enter any no");
scanf("%d",&num);
while(i<=num)
{
fact=fact*i;
i++;
}
printf("factorial of %d=%lu",num,fact);
getch();
}
