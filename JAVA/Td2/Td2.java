// import java.util.function.Function;

// public class Td2 {

//     // Comparator that sorts words by their length
//     private static final Comparator<String> scoreComparator = Comparator.comparingInt(String::length);

    //  public static void main(String[] args) {
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

//  // Basic score function based on length
//     static int score(String word) {
//         return word.length();
//     }

//     // Score function with bonus (5 points if the word contains 'c')
//     static int scoreWithBonus(String word) {
//         return word.length() + (word.contains("c") ? 5 : 0);
//     }

//     // Function that applies the score with bonus as a function
//     static Function<String, Integer> scoreWithBonusFunction = Td2::scoreWithBonus;

//     // Generic comparator function that can accept any scoring function
//     static Comparator<String> genComparator(Function<String, Integer> scoring) {
//         return (o1, o2) -> Integer.compare(scoring.apply(o2), scoring.apply(o1)); // Sorting in descending order
//     }

//     // Method to rank the words using a given comparator
//     static List<String> rankedWords(Comparator<String> comparator, List<String> words) {
//         List<String> sortedWords = new ArrayList<>(words);
//         sortedWords.sort(comparator);
//         return sortedWords;
//     }

//     public static void main(String[] args) {
//         // List of words
//         List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

//         // Using function references to sort the words
//         System.out.println(rankedWords(genComparator(scoreWithBonusFunction), words));
//         System.out.println(rankedWords(genComparator(w -> scoreWithBonus(w)), words));
//         System.out.println(rankedWords(genComparator(Td2::scoreWithBonus), words));
//     }
// }

// FOURTH PART need editing code doesn't work


// class Classe {
//     private int base;

//     public Classe(int base) {
//         this.base = base;
//     }

//     // Instance method
//     public int m1(String w) {
//         return w.length() + base;
//     }

//     // Static method
//     static int m2(String w) {
//         return w.length();
//     }

//     // Static function
//     static Function<String, Integer> m3 = w -> w.length();

//     // Function to apply a transformation to a function
//     static Function<Function<String, Integer>, Function<String, String>> work =
//         f -> w -> String.format("%s", f.apply(w));
// }

// public class Main {
//     public static void main(String[] args) {
//         // Classe objet = new Classe(3);  // Creating an instance of Classe

//         // Calling instance method m1 using the object instance
//         System.out.println(Classe.work.apply(objet::m1).apply("scala"));  // Should print 8 (5 + 3)

//         // Calling static method m2 using the class name
//         System.out.println(Classe.work.apply(Classe::m2).apply("scala"));  // Should print 5

//         // Calling static function m3
//         System.out.println(Classe.work.apply(Classe.m3).apply("scala"));  // Should print 5
//     }
// }

// }



// EXO 1
 // Method that takes score, bonus, and malus functions as parameters
    // static int calculateFinalScore(String word, Function<String, Integer> score, 
                                //    Function<String, Integer> bonus, 
                                //    Function<String, Integer> malus) {

                    //   Alternative to 👆🏻            
                      // static Calculateur score = word -> word.replaceALL (regex:"a", replacement:"").length();
                        // static Calculateur bonus = word -> word.contains("c") ? 5 : 0;
                        // static Calculateur malus = word -> word.contains("s") ? -7 : 0;;
                        // static calculateur wordScore(Calculateur base, Ca{
                        
        // Calculate final score based on score, bonus, and malus
//         return score.apply(word) + bonus.apply(word) + malus.apply(word);
//     }

//     public static void main(String[] args) {
//         // Words to be scored
//         String word1 = "scala";
//         String word2 = "Java";
//         String word3 = "Hey";

//         // Define score, bonus, and malus as functions
//         Function<String, Integer> score = word -> word.length();  // Score based on word length
//         Function<String, Integer> bonus = word -> word.contains("s") ? -7 : 0;  // Bonus if the word contains 's'
//         Function<String, Integer> malus = word -> 0;  // No malus, but can be extended

//         // Displaying the final score for each word by passing the functions as parameters
//         System.out.println("Score for 'scala': " + calculateFinalScore(word1, score, bonus, malus));  // 5 (length 5 + no penalty)
//         System.out.println("Score for 'Java': " + calculateFinalScore(word2, score, bonus, malus));  // 5 (length 5 + no penalty)
//         System.out.println("Score for 'Hey': " + calculateFinalScore(word3, score, bonus, malus)); // 3 (length 8 - 7 for 's')
//     }
// }


// NEW EXO 2 PF 4 PAGE 29
import java.util.*;
import java.util.function.BiFunction;

public class Td2 {
    public static void main(String[] args) {
        // List of numbers to work with
        List<Integer> numbers = Arrays.asList(5, 1, 2, 4, 0);

        // Define BiFunction to filter numbers greater than a given value (n)
        BiFunction<List<Integer>, Integer, List<Integer>> largerThan = (nums, n) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer num : nums) {
                if (num > n) {
                    result.add(num);
                }
            }
            return result;
        };

        // Test the BiFunction with different values for 'n'
        System.out.println(largerThan.apply(numbers, 4));  // Output: [5]
        System.out.println(largerThan.apply(numbers, 1));  // Output: [5, 2, 4]
    }
}
