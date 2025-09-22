import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Td2 {

    // Comparator that sorts words by their length
    private static final Comparator<String> scoreComparator = Comparator.comparingInt(String::length);

    public static void main(String[] args) {
        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

        // Create a copy of the list and sort by word length
        List<String> sortedWords = new ArrayList<>(words);
        sortedWords.sort(scoreComparator);

        // Print the sorted list
        System.out.println(sortedWords);
    }
}
