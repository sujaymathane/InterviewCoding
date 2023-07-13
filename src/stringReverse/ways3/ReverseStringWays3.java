package stringReverse.ways3;

import java.util.Scanner;

public class ReverseStringWays3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String ori=str;
		String rev="";
		
		
		
		// 1.Method by using for loop
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+ str.charAt(i);
		}
		System.out.println(ori+" Reverse by forLoop ----> "+rev);
		
		
		// 2.Method by using charArray
		char[] chararray=str.toCharArray();
		String rev2="";
		for(int i=str.length()-1;i>=0;i--) {
			rev2=rev2+chararray[i];
		}
		System.out.println(ori+" Reverse by CharArray ----> "+rev2);

		// 3rd Method using String Buffer
		StringBuffer sb=new StringBuffer(ori);
		sb.reverse();
		System.out.println(ori+" Reverse by StringBuffer ----> "+sb);
	}

}
