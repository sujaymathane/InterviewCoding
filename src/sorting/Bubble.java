package sorting;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr= {90,20,70,50,30,10};
		
		bubblesorting(myarr);

	}
	
	public static void bubblesorting(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
