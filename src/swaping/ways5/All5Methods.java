package swaping.ways5;

public class All5Methods {

	public static void main(String[] args) {
		
		int o= 10;
		int p = 20;
		
		//using third variable
		int temp=o;
		o=p;
		p=temp;
		System.out.println("using third variable: "+"O= "+o+"P= "+p);
		
		//Without third variable + and - operator
		int a= 10;
		int b = 20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("using + and - operator "+"A= "+a+" B= "+b);
		
		//using * and / operator
		int x=10;
		int y=20;
		
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("using * and / operator "+"X= "+x+" Y= "+y);
		
		// using XOR operator
		int m=10;
		int n=20;
		
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("using XOR operator "+"M= "+m+" N= "+n);
		
		// using single statement line
		int i=10;
		int j=20;
		
		j=i+j-(i=j);
		System.out.println("Using single statement " + "I= "+i+" J= "+j);

	}

}
