public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt(args[0].charAt(0) + "" + args[0].charAt(1));
        int mins = Integer.parseInt(args[0].charAt(3) + "" + args[0].charAt(4));
        int added = Integer.parseInt(args[1]);
        int totalMins = (hours*60) + mins + added;
        int totalHours = (totalMins/60);
        int newHours = totalHours % 24;
        int newMins = totalMins - (totalHours*60);
        if(newHours<10 && newMins<10)
        {
            System.out.println("0" + newHours + ":" + "0" + newMins);
        }
        else if(newHours<10) {
            System.out.println("0" + newHours + ":" + newMins);
        }
        else if(newMins<10) {
            System.out.println(newHours + ":" + "0" + newMins);
        }
        else System.out.println(newHours + ":" + newMins);
    }
}
