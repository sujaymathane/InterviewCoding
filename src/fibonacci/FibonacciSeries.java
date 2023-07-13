package fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibgenerator(100);
		

	}
	public static void fibgenerator(int num) {
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a +", "+b+", ");
		
		while((a+b)<num) {
			c=a+b;
			System.out.print(c+", ");
			a=b;
			b=c;
		}

		
		
		
	}
}
