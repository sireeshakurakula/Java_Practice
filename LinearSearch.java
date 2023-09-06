import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        
        int[] arr = new int[length];
        
        // Input values into the array
        System.out.println("Enter " + length + " integer values:");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("Enter the value to search for: ");
        int searchValue = input.nextInt();
        
        // Perform linear search
        int foundIndex = -1; // Initialize to -1 (not found)
        for (int i = 0; i < length; i++) {
            if (arr[i] == searchValue) {
                foundIndex = i;
                break; // Value found, exit the loop
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Value " + searchValue + " found at index " + foundIndex);
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }
        
        input.close();
    }
}
