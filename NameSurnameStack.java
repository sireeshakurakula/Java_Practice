import java.util.ArrayList;
import java.util.Arrays;

public class NameSurnameStack {
    public static void main(String[] args) {
        // Arrays for first names and surnames
        String[] firstNames = {"Sireesha", "kowsika", "vaishnavi", "hemangi"};
        String[] lastNames = {"Kurakula", "moorthy", "swami", "bhangale"};

        // Convert arrays to ArrayLists
        ArrayList<String> firstNamesList = new ArrayList<>(Arrays.asList(firstNames));
        ArrayList<String> lastNamesList = new ArrayList<>(Arrays.asList(lastNames));

        // Combine the two ArrayLists
        ArrayList<String> fullNameList = new ArrayList<>();
        for (int i = 0; i < firstNamesList.size(); i++) {
            String fullName = firstNamesList.get(i) + " " + lastNamesList.get(i);
            fullNameList.add(fullName);
        }

        // Print the combined list
        System.out.println("Combined Names and Surnames:");
        for (String fullName : fullNameList) {
            System.out.println(fullName);
        }
    }
}