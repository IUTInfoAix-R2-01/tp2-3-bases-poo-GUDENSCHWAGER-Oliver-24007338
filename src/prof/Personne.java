package prof;

public class Personne {
	public String Nom;
	public String Prenom;
	
	public Personne() {
		Nom = "Doe";
		Prenom = "John";
	}
	
	public Personne(String Prenom) {
		Nom = "Doe";
		this.Prenom = Prenom;
	}
	
	public Personne(String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String toString() {
		if (Nom == "Doe" && Prenom != "John") {
			return "Personne[Prenom=" + Prenom + "]";
		}
		else {
			return "Personne[Nom=" + Nom + ",Prenom=" + Prenom + "]";	
		}
	}
}
