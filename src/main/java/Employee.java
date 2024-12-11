/**
 * Représente un employé avec un nom, un identifiant et un poste.
 * Cette classe permet de créer un objet représentant un employé et d'accéder à ses informations.
 * 
 * @since 1.0
 */
public class Employee {
    // Attributs
    private String nom; // Nom de l'employé
    private int id; // Identifiant unique de l'employé
    private String position; // Poste occupé par l'employé

    /**
     * Initialise un nouvel employé avec les informations spécifiées.
     * 
     * @param nom Le nom de l'employé (non vide).
     * @param id L'identifiant unique de l'employé (doit être positif).
     * @param position Le poste de l'employé.
     * @throws IllegalArgumentException Si le nom est vide ou si l'identifiant est invalide.
     */
    public Employee(String nom, int id, String position) throws IllegalArgumentException {
        if (nom == null || nom.length() == 0) {
            throw new IllegalArgumentException("Le nom de l'employé ne peut pas être vide.");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("L'identifiant de l'employé doit être positif.");
        }
        this.nom = nom;
        this.id = id;
        this.position = position;
    }

    /**
     * Retourne le nom de l'employé.
     * 
     * @return Le nom de l'employé.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne l'identifiant de l'employé.
     * 
     * @return L'identifiant de l'employé.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retourne le poste occupé par l'employé.
     * 
     * @return Le poste de l'employé.
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'employé.
     * 
     * @return Une chaîne contenant le nom, l'identifiant et le poste de l'employé.
     */
    public String toString() {
        return this.nom + " " + this.id + " " + this.position;
    }
}
