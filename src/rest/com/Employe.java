package rest.com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* Modelise un client de bankonet.
*
* <p>Un client est caracterise par :
* <ul>
* <li> son identifiant unique
* <li> son nom
* <li> son prenom
* <li> la liste de ses comptes
* </ul>
*/

@Entity
public class Employe {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    

    /**
     * @param nom
     * @param prenom
     * @param identifiant
     */
    public Employe(){};
    
    public Employe(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public Employe(Integer identifiant, String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.id = identifiant;
    }

    public Integer getIdentifiant() {
        return id;
    }
    /**
     * Retourne le nom du client.
     *
     * @return java.lang.String
     */
    public String getNom() {
        return nom;
    }
    /**
     * Retourne le prenom du client.
     * 
     * @return java.lang.String
     */
    public String getPrenom() {
        return prenom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public void setIdentifiant(Integer identifiant) {
        this.id = identifiant;
    }

    @Override
    public String toString() {
        return "{\n id : " + id + ",\n"
                + " nom:" + nom
                + ",\n prenom:" + prenom + ",\n}\n";
    }
    
    
}