package searching;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60,70,90};
		binarysearch(arr, 0, arr.length-1, 40);

	}
	
	public static void binarysearch(int [] arr, int left, int right,int key) {
		int mid=(left+right)/2;
		if(right<left) {
			System.out.println("Element is not found");
			return;
		}
		if(key==arr[mid]) {
			System.out.println("Key is found at index: "+ mid);
		}
		
		if(key<arr[mid]) {
			binarysearch(arr, left, mid-1, key);
		}
		
		if(key>arr[mid]) {
			binarysearch(arr,mid+1,right,key);
		}
		
		
	}

}
