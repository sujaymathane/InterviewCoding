package factorial;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialcal(7));

	}
	public static int factorialcal(int num) {
		
		if(num==0 || num== 1) {
			return 1;
		}
		return num*factorialcal(num-1);
	}

}
