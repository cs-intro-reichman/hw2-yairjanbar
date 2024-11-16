// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		if (num==0) {
			System.out.println("pi according to Java: 3.141592653589793"+"");
			System.out.println("pi approximated:     " + 0);
		}
		else
		{
			double sum = 1.0;
			double n;
			for (n=1;n<num;n=n+2); { 
				if ((n%2)==0) {
					sum = sum + (1.0/n) ;
				}
				else sum = sum - (1.0/n);
			}
			System.out.println("pi according to Java: 3.141592653589793"+"");
			System.out.println("pi approximated:     " + sum*4);
		}
	}
}
