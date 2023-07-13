package stringrelated;

public class ReverseEveryword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String welcome="Welcome to epitage";
		reverseall(welcome);

	}
	
	public static void reverseall(String str) {
		String [] words=str.split(" ");
		
		String reverse="";
		
		for(String s: words) {
			
			for(int i=s.length()-1;i>=0;i--) {
				reverse=reverse+s.charAt(i);
			}
			reverse+=" ";
			
		}
		System.out.println(reverse);
	}

}
