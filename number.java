package sneha;

import java.util.Scanner;

public class number {
	public static void main(String args[]) {
		int countp=0,countn=0,countz=0,n,i;
		Scanner st =new Scanner(System.in);
		System.out.println(" number:");
		n=st.nextInt();
		for(i=1;i<=5;i++){
		
		if(n>0)
		{
			
			countp++;
		}
		else if(n<0)
		 {
			
			countn++;
		}
		else
		 {
			
			countz++;
		}	
	}
		System.out.println("positive numbers: "+countp);
		System.out.println("negative numbers: "+countn);
		System.out.println("zero: "+countz);
		}
	}




