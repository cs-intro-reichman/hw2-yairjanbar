// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double approximatedPi = 0.0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                approximatedPi += 1.0 / (2 * i + 1);
            } else {
                approximatedPi -= 1.0 / (2 * i + 1);
            }
        }
		approximatedPi = approximatedPi*4;	
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     " + approximatedPi);
		}
	}
