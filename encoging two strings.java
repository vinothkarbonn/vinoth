package encoder;

import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		String l="",d="";
		char h;
		int v=1;
		int i=0,j=0;
		for(i=0;i<a.length();i++){
			h=a.charAt(i);
			if(h>='a'&&h<='p'){
			l+=(char)(h+10);
		}else{
			if(h>='r'&&h<='z'){
				v=0;
				while((122-h+v)!=10){
					v++;
				}
				
				 l+=(char)(v+97);					 
			}
		}
	}for(i=1;i<a.length()-1;i++){
		h=b.charAt(i);
		if(h>='a'&&h<='r'){
		d+=(char)(h+10);
	}else{
		if(h>='s'&&h<='z'){
			v=0;
			while((122-h+v)!=9){
				v++;
			}System.out.println(v);
			 d+=(char)(v+97);					 
		}
	}
}
		System.out.println(l+" "+b.charAt(0	)+d+b.charAt(b.length()-1));
		
}}