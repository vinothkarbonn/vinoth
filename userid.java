package Guvi;

public class UserId {

    public static void main(String[] args) {
        String fn="raja";
String ln="sivtre";
String pin="630056";int i=0;
int N=4;
String t="",r="",p="", h="";
if(fn.length()>ln.length()){
t=fn;
fn=ln;
ln=t;
}
else
if(fn.length()==ln.length()){
if(fn.compareTo(ln)>0)
{
t=ln;
ln=fn;
fn=t;
}
}
System.out.println("larger name:"+ln);
System.out.println("smaller name:"+fn);
System.out.println("pin:"+pin);
r=ln.charAt(0)+fn;
for(i=0;i<r.length();i++)
{
  h= Character.toString(r.charAt(i));
if(Character.isUpperCase(r.charAt(i)))
{
p+=h.toLowerCase();}
else{
p+=h.toUpperCase();
}
}
System.out.println(p+pin.charAt(N-1)+pin.charAt(pin.length()-N));
}
}
    
