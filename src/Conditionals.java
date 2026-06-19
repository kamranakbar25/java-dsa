import java.util.Scanner;

public class Conditionals {
    static void main(String[] args){
        int marks = 78;
        if (marks >= 90){
            System.out.println("Excellent");
        }
        else if (marks >= 70){
            System.out.println("Good");
        }
        else if (marks >= 50){
            System.out.println("Average");
        }
        else {
            System.out.println("Need Improvement.");
        }

        int streakDays = 35;
        String status = (streakDays >= 30) ? "Consistent" : "Inconsistent";
        System.out.println(status);

        System.out.print("Enter value of day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
