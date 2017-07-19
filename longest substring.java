class Vinoth
{
public static void main(String[] args)
{

String a=args[0];
String b=" ",c=" ",e="",d="";
int i=0,k=0,j=0,l=0;
int r=0;
for(i=0;i<=a.length()-2;i++)
{
for(j=a.length();j>i;j--){
b=a.substring(i,j);
r=0;
for(k=0;k<b.length();k++){
for(l=0;l<b.length();l++){
if(b.charAt(k)==b.charAt(l)){
r++;
}
}
}
if(r==b.length()){
d=b;
if(d.length()>e.length()){

e=d;
}
}
}
}
System.out.println(e+" "e.length());
}
}
