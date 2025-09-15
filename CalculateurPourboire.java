import java.util.List;
import java.util.ArrayList;

public class CalculateurPourboire {
    private List<String> noms = new ArrayList<>();
    private int pourcentage = 0;

    public void ajouterPersonne(String nom) {
        noms.add(nom);
        if (noms.size() > 5) {
            pourcentage = 20;
        } else if (noms.size() > 0) {
            pourcentage = 10;
        }
    }

    public List<String> noms() {
        return noms;
    }

    public int pourcentage() {
        return pourcentage;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CalculateurPourboire calculateur = new CalculateurPourboire();

        // Adding some people
        calculateur.ajouterPersonne("Alice");
        calculateur.ajouterPersonne("Bob");
        calculateur.ajouterPersonne("Charlie");

        // Printing the results
        System.out.println("Noms: " + calculateur.noms());
        System.out.println("Pourcentage: " + calculateur.pourcentage());

        // Adding more people
        calculateur.ajouterPersonne("David");
        calculateur.ajouterPersonne("Eve");
        calculateur.ajouterPersonne("Frank");

        // Printing the results again
        System.out.println("Noms: " + calculateur.noms());
        System.out.println("Pourcentage: " + calculateur.pourcentage());
    }
}
