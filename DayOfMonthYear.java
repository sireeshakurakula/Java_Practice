import java.util.Scanner;

public class DayOfMonthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month input.");
        } else {
            int days = getDaysInMonth(month);
            System.out.println("Number of days in month " + month + " is: " + days);
        }

        sc.close();
    }

    public static int getDaysInMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 3: 
                return 29; // Assuming a non-leap year
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}
