import java.util.HashMap;

public class WordCount {
	 public static void main(String[] args) {
	        String str = "Hello, how are you? This is a test string, test string!";
	        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

	        // Split the string into words
	        String[] words = str.split("\\s+");

	        // Count the number of occurrences of each word
	        for (String word : words) {
	            // Remove punctuation marks
	            word = word.replaceAll("[^a-zA-Z0-9]", "");

	            // Convert to lowercase
	            word = word.toLowerCase();

	            // Update the word count in the map
	            if (word.length() > 0) {
	                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	            }
	        }

	        // Display the word count
	        System.out.println("Word count:");
	        for (String word : wordCountMap.keySet()) {
	            System.out.println(word + ": " + wordCountMap.get(word));
	        }
	    }
	}


