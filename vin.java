import java.util.Scanner;
class prefix
{
    public static void main(String a[])
    {
        int i=0,j=1,m=0,n=0,l;
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        String c[]=b.split(" ");
        Arrays.sort(c);
        char r,e;
        for(i=0;i<c[0].length()&&m==0;i++)
        {
            for(j=0;j<c.length;j++)
            {r=c[0].charAt(i);
            e=c[j].charAt(i);
                if(r==e)
                    {l=0;}
                else
                    m=1;
                
                
            }n++;
        }
        for(i=0;i<n-1;i++)
        {
            System.out.print(c[0].charAt(i));
        }
    }
}
