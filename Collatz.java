// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number2 = Integer.parseInt(args[0]);
		String s= args[1];
		int number3=1;
		if (mode.equals("v")) {
			while(number3<=number2) {
				int counter=1;
				int number=number3;
				System.out.print(number + " ");
				while (number!=0)
				{
					if (number%2==0) number=number/2;
					else number = (number*3)+1;
					System.out.print(number + " ");
					if (number==1) number=0;
					counter++;
				}
				System.out.print("(" + counter + ")");
				System.out.println("");
				number3++;
			}
			System.out.println("Every one of the first " +number2+" hailstone sequences reached 1.");
	
		}
		if (mode.equals("c")) {
			System.out.println("Every one of the first " +number2+" hailstone sequences reached 1.");
		}
	}
}
