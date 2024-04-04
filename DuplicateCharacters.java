import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
	public static void main(String[] args) {
        String str = "Hello, World!";
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Remove whitespace and punctuation marks
        str = str.replaceAll("[^a-zA-Z]", "");

        // Count the number of occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Display the duplicate characters
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}


