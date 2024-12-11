import java.util.ArrayList;
import java.util.List;

/**
 * Représente un département dans une entreprise. Cette classe permet de gérer
 * le nom du département ainsi que la liste des employés qui y travaillent.
 */
public class Department {

    // Attributs
    private String name; // Le nom du département
    private List<Employee> employees; // Liste des employés du département

    /**
     * Initialise un nouveau département avec le nom spécifié.
     * 
     * @param name Le nom du département.
     * @throws IllegalArgumentException si le nom du département est vide ou nul.
     */
    public Department(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du département ne peut pas être vide.");
        }
        this.name = name;
        this.employees = new ArrayList<>(); // Initialisation de la liste des employés
    }

    /**
     * Ajoute un employé au département.
     * 
     * @param employee L'employé à ajouter.
     * @throws IllegalArgumentException si l'employé est nul.
     */
    public void addEmployee(Employee employee) throws IllegalArgumentException {
        if (employee == null) {
            throw new IllegalArgumentException("L'employé ne peut pas être nul.");
        }
        employees.add(employee); // Ajout de l'employé à la liste des employés
    }

    /**
     * Retire un employé du département.
     * 
     * @param employee L'employé à retirer.
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee); // Retrait de l'employé de la liste
    }

    /**
     * Retourne la liste des employés du département.
     * 
     * @return Une nouvelle liste contenant tous les employés du département.
     *         Cette méthode retourne une copie pour éviter les modifications externes.
     */
    public List<Employee> listEmployees() {
        return new ArrayList<>(employees); // Retourne une copie de la liste des employés
    }

    /**
     * Représente le département sous forme de chaîne de caractères.
     * 
     * @return Une chaîne de caractères représentant le département et ses employés.
     */
    public String toString() {
        String res = "Nom du département : " + this.name;
        res += "\nListe des employés :\n";
        for (Employee employee : employees) {
            res += employee.toString() + "\n"; // Appel de la méthode toString() de chaque employé
        }
        return res;
    }
}
