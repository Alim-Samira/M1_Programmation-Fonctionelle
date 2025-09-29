// utiliser filter pour réaliser les fonctions suivantes sur
// les éléments d’une liste
// taille < 5 (“scala” KO,
// “java” OK)
// plus d’un ‘l’ (“scala” KO,
// “haskell” OK)
// nombres pairs
// nombres > 4
// words.filter(word=>word.length<5

// object TD2 {
//   def main(args: Array[String]): Unit = {

//     // List of words
//     val words = List("scala", "java", "haskell", "python")

//     // List of numbers
//     val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

//     // 1. Words with length < 5
//     val shortWords = words.filter(word => word.length < 5)
//     println(s"Words with length < 5: $shortWords")  // Output: List(java)

//     // 2. Words with more than one 'l'
//     val wordsWithMultipleL = words.filter(word => word.count(_ == 'l') > 1)
//     println(s"Words with more than one 'l': $wordsWithMultipleL")  // Output: List(haskell)

//     // 3. Even numbers
//     val evenNumbers = numbers.filter(number => number % 2 == 0)
//     println(s"Even numbers: $evenNumbers")  // Output: List(2, 4, 6, 8)

//     // 4. Numbers greater than 4
//     val numbersGreaterThan4 = numbers.filter(number => number > 4)
//     println(s"Numbers greater than 4: $numbersGreaterThan4")  // Output: List(5, 6, 7, 8, 9)
//   }
// }


// EXERCICE
// écrire des fonctions qui retournent :
// la somme des entiers d’une liste
// la longueur totale des mots d’une liste
// le nombre total de ‘s’ dans les mots d’une liste
// le maximum des entiers d’une liste

// object Main extends App {

object TD2 {
  // Functions to compute various statistics
  def sumOfIntegers(numbers: List[Int]): Int = {
    numbers.foldLeft(0)((acc, num) => acc + num)
  }

  def totalLengthOfWords(words: List[String]): Int = {
    words.foldLeft(0)((acc, word) => acc + word.length)
  }

  def countS(words: List[String]): Int = {
    words.foldLeft(0)((acc, word) => acc + word.count(_ == 's'))
  }

  def maxOfIntegers(numbers: List[Int]): Int = {
    numbers.reduceLeft((max, num) => if (num > max) num else max)
  }

  // Test data
  val numbers = List(1, 2, 3, 4, 5)
  val words = List("scala", "java", "haskell", "python")

  // Output the results
  println(sumOfIntegers(numbers))         // Expected output: 15
  println(totalLengthOfWords(words))     // Expected output: 22
  println(countS(words))                 // Expected output: 3
  println(maxOfIntegers(numbers))        // Expected output: 5
}