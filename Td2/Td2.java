import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Td2 {

//     // Comparator that sorts words by their length
//     private static final Comparator<String> scoreComparator = Comparator.comparingInt(String::length);

//     public static void main(String[] args) {
//         List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

//         // Create a copy of the list and sort by word length
//         List<String> sortedWords = new ArrayList<>(words);
//         sortedWords.sort(scoreComparator);

//         // Print the sorted list
//         System.out.println(sortedWords);
//     }
// }

// SECOND PART

//     // Basic score based on length of word
//     static int score(String word) {
//         return word.length();
//     }

//     // Score with bonus if the word contains the letter 'c'
//     static int scoreWithBonus(String word) {
//         int base = score(word);
//         return (word.contains("c")) ? base + 5 : base;
//     }

//     // Comparator to sort words based on their basic score
//     static Comparator<String> scoreComparator =
//         (o1, o2) -> Integer.compare(score(o2), score(o1));  // o2 before o1 to get descending order

//     // Comparator to sort words based on their score with bonus
//     static Comparator<String> scoreWithBonusComparator =
//         (o1, o2) -> Integer.compare(scoreWithBonus(o2), scoreWithBonus(o1));  // o2 before o1 to get descending order

//     // Method to rank the words based on a comparator
//     static List<String> rankedWords(Comparator<String> comparator, List<String> words) {
//         List<String> sortedWords = new ArrayList<>(words);
//         sortedWords.sort(comparator);
//         return sortedWords;
//     }

//     public static void main(String[] args) {
//         // List of words to rank
//         List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

//         // Print ranked words based on basic score
//         System.out.println("Ranked by score: " + rankedWords(scoreComparator, words));

//         // Print ranked words based on score with bonus
//         System.out.println("Ranked by score with bonus: " + rankedWords(scoreWithBonusComparator, words));
//     }
// }


// THIRD PART

 // Basic score function based on length
    static int score(String word) {
        return word.length();
    }

    // Score function with bonus (5 points if the word contains 'c')
    static int scoreWithBonus(String word) {
        return word.length() + (word.contains("c") ? 5 : 0);
    }

    // Function that applies the score with bonus as a function
    static Function<String, Integer> scoreWithBonusFunction = Td2::scoreWithBonus;

    // Generic comparator function that can accept any scoring function
    static Comparator<String> genComparator(Function<String, Integer> scoring) {
        return (o1, o2) -> Integer.compare(scoring.apply(o2), scoring.apply(o1)); // Sorting in descending order
    }

    // Method to rank the words using a given comparator
    static List<String> rankedWords(Comparator<String> comparator, List<String> words) {
        List<String> sortedWords = new ArrayList<>(words);
        sortedWords.sort(comparator);
        return sortedWords;
    }

    public static void main(String[] args) {
        // List of words
        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

        // Using function references to sort the words
        System.out.println(rankedWords(genComparator(scoreWithBonusFunction), words));
        System.out.println(rankedWords(genComparator(w -> scoreWithBonus(w)), words));
        System.out.println(rankedWords(genComparator(Td2::scoreWithBonus), words));
    }
}