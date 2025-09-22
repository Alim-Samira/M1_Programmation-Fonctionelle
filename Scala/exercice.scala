object Exercice {

  // 1. Renvoie les deux premiers éléments de la liste
  def firstTwo(list: List[String]): List[String] = {
    list.take(2)  // Utilise la méthode 'take' pour prendre les 2 premiers éléments
  }

  // 2. Renvoie les deux derniers éléments de la liste
  def lastTwo(list: List[String]): List[String] = {
    list.takeRight(2)  // Utilise la méthode 'takeRight' pour prendre les 2 derniers éléments
  }

  // 3. Déplace les deux premiers éléments à la fin de la liste
  def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
    list.drop(2) ++ list.take(2)  // Utilise 'drop' pour ignorer les 2 premiers éléments et 'take' pour les prendre à la fin
  }

  // 4. Insère un élément avant le dernier élément de la liste
  def insertedBeforeLast(list: List[String], elem: String): List[String] = {
    val (init, last) = list.splitAt(list.length - 1)  // 'splitAt' permet de séparer en deux parties : avant dernier et dernier élément
    init :+ elem :+ last.head  // Ajoute l'élément avant le dernier
  }

  // Test des méthodes dans la méthode `main`
  def main(args: Array[String]): Unit = {
    val list1 = List("a", "b", "c") // Création de la première liste avec trois éléments : "a", "b", "c"
    val list2 = List("a", "b")  // Création de la deuxième liste avec deux éléments : "a", "b"

   // Test the methods
    val result1 = firstTwo(list1)  // Calls `firstTwo` to get the first 2 elements of `list1`, which gives List("a", "b")
    val result2 = lastTwo(list1)   // Calls `lastTwo` to get the last 2 elements of `list1`, which gives List("b", "c")
    val result3 = movedFirstTwoToTheEnd(list1)  // Calls `movedFirstTwoToTheEnd` to move the first 2 elements to the end of `list1`, which gives List("c", "a", "b")
    val result4 = insertedBeforeLast(list2, "c")  // Calls `insertedBeforeLast` to insert "c" before the last element of `list2`, which gives List("a", "c", "b")


    // Affichage des résultats
    println(result1)  // => List("a", "b")
    println(result2)  // => List("b", "c")
    println(result3)  // => List("c", "a", "b")
    println(result4)  // => List("a", "c", "b")
  }
}
