#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
printf("enter a char from keyboard");
scanf("%c",&ch);
if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
{
printf("it is an alphabet");
}
else
{
printf("it is not an alphabet");
}
getch();
}
