package primenumber;

public class PrimeNoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(primecheck(11)) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime");
		}
		
		primecheckrange(100);
		//2, 3, 5, 7, 11, 13, 17, 19,
		//23, 29, 31, 37, 41, 43, 47, 
		//53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
		
	}
	
	public static boolean primecheck(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				flag=false;
		}
		
		return flag;
	}
	
	public static void primecheckrange(int num) {
		System.out.println("List of all the prime numbers till " + num +" as follows: ");
		System.out.println();
		for(int i=2;i<num;i++) {
			int element=i;
			boolean flag=true;
			for(int j=2;j<element;j++) {
				if(element%j==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.print(", "+element);
			}
		}
	}
	

}
