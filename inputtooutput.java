import java.util.Scanner;
import java.util.Arrays;
public class InputToOutput {
	static int k=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i;
		int len=0;
		for(i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				++len;
			}
		}
		char ch1[]=new char[len];
		for(i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				ch1[k]=str.charAt(i);
				++k;
			}
		}
		Arrays.sort(ch1);
		int large=0;
		int small=0;
		large=Character.getNumericValue(ch1[k-1]);
		small=Character.getNumericValue(ch1[0]);
		large=sum(large,ch1);
		small=sum(small,ch1);
    large=single(large);
		small=single(small);
		int digit=Math.min(large, small);
		System.out.println("Output is :: "+digit*digit);
		sc.close();
}
	public static int sum(int large,char[] ch1){
		int i;
		int sum=0;
		for(i=0;i<k;i++){
			sum=sum+(large*ch1[i]);
		}
		return sum;
	}
	public static int single(int large){
		int sum=0;
		int a=0;
		while(!(large>=0 &&  large<=9)){
			while(large!='\0'){
				a=large%10;
				sum=sum+(a);
				large=large/10;
			}
			large=sum;
			sum=0;
		}
		return large;
	}
}
