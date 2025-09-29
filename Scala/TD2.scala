// utiliser filter pour réaliser les fonctions suivantes sur
// les éléments d’une liste
// taille < 5 (“scala” KO,
// “java” OK)
// plus d’un ‘l’ (“scala” KO,
// “haskell” OK)
// nombres pairs
// nombres > 4
// words.filter(word=>word.length<5

object TD2 {
  def main(args: Array[String]): Unit = {

    // List of words
    val words = List("scala", "java", "haskell", "python")

    // List of numbers
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 1. Words with length < 5
    val shortWords = words.filter(word => word.length < 5)
    println(s"Words with length < 5: $shortWords")  // Output: List(java)

    // 2. Words with more than one 'l'
    val wordsWithMultipleL = words.filter(word => word.count(_ == 'l') > 1)
    println(s"Words with more than one 'l': $wordsWithMultipleL")  // Output: List(haskell)

    // 3. Even numbers
    val evenNumbers = numbers.filter(number => number % 2 == 0)
    println(s"Even numbers: $evenNumbers")  // Output: List(2, 4, 6, 8)

    // 4. Numbers greater than 4
    val numbersGreaterThan4 = numbers.filter(number => number > 4)
    println(s"Numbers greater than 4: $numbersGreaterThan4")  // Output: List(5, 6, 7, 8, 9)
  }
}
