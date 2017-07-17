class alpha
{
public static void main(String[] args)
{

String a=args[0];
String b="",c="",d="",e=" ";
int i=0,k=0;
for(i=0;i<=a.length()-2;i++)
{
for(k=a.length();k>i;k--){
b=a.substring(i,k);
c=new StringBuffer(b).reverse().toString();
if(b.equals(c))
{
d=b;
if(d.length()>e.length())
{System.out.println(e);
e=d;}
}
}
}
System.out.println(e);
}
}