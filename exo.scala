object Exo {

  // 1. Renvoie les deux premiers éléments de la liste
  def firstTwo(list: List[String]): List[String] = {
    list.slice(0, 2)  // Utilise 'slice' pour prendre les éléments de l'indice 0 à 2 (exclu), ce qui donne les 2 premiers éléments
  }

  // 2. Renvoie les deux derniers éléments de la liste
  def lastTwo(list: List[String]): List[String] = {
    list.slice(list.length - 2, list.length)  // Utilise 'slice' pour prendre les éléments des indices [list.length-2, list.length)
  }

  // 3. Déplace les deux premiers éléments à la fin de la liste
  def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
    list.slice(2, list.length) ++ list.slice(0, 2)  // Utilise 'slice' pour prendre tout après les 2 premiers éléments, puis les 2 premiers éléments à la fin
  }

  // 4. Insère un élément avant le dernier élément de la liste
  def insertedBeforeLast(list: List[String], elem: String): List[String] = {
    val init = list.slice(0, list.length - 1)  // Prend tous les éléments sauf le dernier
    val last = list.last  // Le dernier élément
    init :+ elem :+ last  // Ajoute l'élément avant le dernier
  }

  // Test des méthodes dans la méthode `main`
  def main(args: Array[String]): Unit = {
    val list1 = List("a", "b", "c") // Création de la première liste avec trois éléments : "a", "b", "c"
    val list2 = List("a", "b")  // Création de la deuxième liste avec deux éléments : "a", "b"

    // Test des méthodes
    val result1 = firstTwo(list1)  // => List("a", "b")
    val result2 = lastTwo(list1)   // => List("b", "c")
    val result3 = movedFirstTwoToTheEnd(list1)  // => List("c", "a", "b")
    val result4 = insertedBeforeLast(list2, "c")  // => List("a", "c", "b")

    // Affichage des résultats
    println(result1)  // => List("a", "b")
    println(result2)  // => List("b", "c")
    println(result3)  // => List("c", "a", "b")
    println(result4)  // => List("a", "c", "b")
  }
}
