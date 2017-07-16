import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in); // use the Scanner class to read from stdin
     int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           {
           a[i]=s.nextInt();
       }
       
       for(int i=0;i<n;i++)
       {
        if(a[i]>=0&&a[i]==i)
            System.out.println(a[i]);
       }
           
   }
}