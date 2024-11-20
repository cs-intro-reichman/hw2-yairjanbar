// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
        String name = args[0];
        String capitalCheerWord = "";
        for (int j=0;j<name.length();j++) {
            char letter = name.charAt(j);
            switch (letter) {
                case 'a': case 'A':
                capitalCheerWord += 'A'; 
                    break;
                case 'b': case 'B':
                capitalCheerWord += 'B';
                    break;
                case 'c': case 'C':
                capitalCheerWord += 'C';
                    break;
                case 'd': case 'D':
                capitalCheerWord += 'D';
                    break;
                case 'e': case 'E':
                capitalCheerWord += 'E';
                    break;
                case 'f': case 'F':
                capitalCheerWord += 'F';
                    break;
                case 'g': case 'G':
                capitalCheerWord += 'G';
                    break;
                case 'h': case 'H':
                capitalCheerWord += 'H';
                    break;
                case 'i': case 'I':
                capitalCheerWord += 'I';
                    break;
                case 'j': case 'J':
                capitalCheerWord += 'J';
                    break;
                case 'k': case 'K':
                capitalCheerWord += 'K';
                    break;
                case 'l': case 'L':
                capitalCheerWord += 'L';
                    break;
                case 'm': case 'M':
                capitalCheerWord += 'M';
                    break;
                case 'n': case 'N':
                capitalCheerWord += 'N';
                    break;
                case 'o': case 'O': 
                capitalCheerWord += 'O';
                    break;
                case 'p': case 'P':
                capitalCheerWord += 'P';
                    break;
                case 'q': case 'Q':
                capitalCheerWord += 'Q';
                    break;
                case 'r': case 'R':
                capitalCheerWord += 'R';
                    break;
                case 's': case 'S':
                capitalCheerWord += 'S';
                    break;
                case 't': case 'T':
                capitalCheerWord += 'T';
                    break;
                case 'u': case 'U':
                capitalCheerWord += 'U';
                    break;
                case 'v': case 'V':
                capitalCheerWord += 'V';
                    break;
                case 'w': case 'W':
                capitalCheerWord += 'W';
                    break;
                case 'x': case 'X':
                capitalCheerWord += 'X';
                    break;
                case 'y': case 'Y':
                capitalCheerWord += 'Y';
                    break;
                case 'z': case 'Z':
                capitalCheerWord += 'Z';
                    break;
                default:
                    break;
            }
        }
            int l = capitalCheerWord.length();
            int num = Integer.parseInt(args[1]);
            for (int i=0; i<l;i++) {
                char tav = capitalCheerWord.charAt(i);
                if (tav == 'A'|| tav == 'E'|| tav == 'F'|| tav == 'H'|| tav == 'I'|| tav == 'L'||
                tav == 'M'|| tav == 'N'|| tav == 'O'|| tav == 'R'||tav == 'S'||tav == 'X'){
                        System.out.println("Give me an " + tav + ": " + tav + "!" );
                }
                else System.out.println("Give me a  " + tav + ": " + tav + "!" );
            }
            System.out.println("What does that spell?");
            for (int n=0;n<num;n++)
            {
                System.out.println(capitalCheerWord + "!!!");
            }
        }           
}
