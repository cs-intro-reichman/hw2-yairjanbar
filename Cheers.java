// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0];
            int l = name.length();
            int num = Integer.parseInt(args[1]);
            for (int i=0; i<l;i++) {
                char tav = name.charAt(i);
                if (tav == 'A'|| tav == 'E'|| tav == 'F'|| tav == 'H'|| tav == 'I'|| tav == 'L'||
                tav == 'M'|| tav == 'N'|| tav == 'O'|| tav == 'R'||tav == 'S'||tav == 'X'){
                        System.out.println("Give me an " + tav + ": " + tav + "!" );
                }
                else System.out.println("Give me a  " + tav + ": " + tav + "!" );
            }
            System.out.println("What does that spell?");
            for (int n=0;n<num;n++)
            {
                System.out.println(name + "!!!");
            }
        }
}
