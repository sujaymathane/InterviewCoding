package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarr= {5,2,8,3,2,5,7,6,3,3};
		duplicateFinder(myarr);
		duplicateFinderUsingSet(myarr);
	}
	
	public static void duplicateFinder(int [] arr) {
		System.out.println("Repeated elements are as follows: ");
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==element && i!=j && j>i) {
					System.out.print(" "+element);
				}
			}
		}
	}	
	
	public static void duplicateFinderUsingSet(int [] arr) {
		Set<Integer> duplicates=new HashSet<Integer>();
		System.out.println();
		System.out.println("Duplicates are as: ");
		for(int i=0;i<arr.length;i++) {
			if(!duplicates.add(arr[i])) {
				System.out.print(arr[i]+" ");
			}
				
		}
	}
	
	

}
