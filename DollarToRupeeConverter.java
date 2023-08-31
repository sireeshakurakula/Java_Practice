import java.util.Scanner;

public class DollarToRupeeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount in dollars: ");
        double dollars = sc.nextDouble();
        
        // Conversion rate: 1 dollar = 82.65 rupees 
        double conversionRate = 82.65;
        
        double rupees = dollars * conversionRate;
        
        System.out.println(dollars + " dollars is equal to " + rupees + " rupees.");
        
        sc.close();
    }
}
