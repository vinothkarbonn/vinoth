package Guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a=sc.nextInt();
		int c=0;
int[]x=new int[a];
for(int i=0;i<a;i++){
x[i]=sc.nextInt();	}
for(int i=0;i<a;i++){

for(int j=i+1;j<a;j++){
	if(x[i]!=x[j]){
		c=i;
	 
	 }
}
	}System.out.println(x[c]);
}
}
