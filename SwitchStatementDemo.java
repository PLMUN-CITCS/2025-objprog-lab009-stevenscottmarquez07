public class SwitchStatementDemo {
    public static void main(String[] args) {
        
        // Step 1: Declare Day Variable (Integer)
        int dayOfWeek = 4; // Thursday
        
        // Step 2: Switch Statement for Day of the Week
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday: Start of the work week.");
                break;
            case 2:
                System.out.println("Tuesday: Keep going!");
                break;
            case 3:
                System.out.println("Wednesday: Midweek.");
                break;
            case 4:
                System.out.println("Thursday: Almost there.");
                break;
            case 5:
                System.out.println("Friday: Weekend is near.");
                break;
            case 6:
                System.out.println("Saturday: Enjoy your day off!");
                break;
            case 7:
                System.out.println("Sunday: Rest and recharge.");
                break;
            default:
                System.out.println("Invalid day.");
        }

        // Step 3: Declare Grade Variable (Character)
        char studentGrade = 'B'; // 'B' grade

        // Step 4: Switch Statement for Grade Evaluation
        switch (studentGrade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
