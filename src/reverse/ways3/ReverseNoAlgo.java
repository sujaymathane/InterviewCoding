package reverse.ways3;

import java.util.Scanner;

public class ReverseNoAlgo {

	public static void main(String[] args) {
		System.out.println("Enter the number, ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ori=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(ori + " Reverse to ---> "+rev);
		
		//Using StringBuffer
		StringBuffer sb=new StringBuffer(String.valueOf(ori));
		sb.reverse();
		System.out.println(ori + "Reverse by StringBuffer ---> "+ sb);
		
		
		//Using StringBuilder
		StringBuilder builder=new StringBuilder();
		builder.append(ori);
		StringBuilder builderev=builder.reverse();
		System.out.println(ori + "Reverse by StringBuilder ---> "+ builderev);

		
		
		
		
		
		
		sc.close();
	}

}
