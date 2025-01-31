package prof;

public class TestPersonne {
	public static void main(String[] args) {
		Personne p1 = new Personne("Laurence", "Ago");
		Personne p2 = new Personne("Lolo");
		System.out.println("le prenom et nom de p1 sont " + p1.getPrenom() + " " + p1.getNom());
		System.out.println("le prenom de p2 est " + p2.getPrenom());
	}
}
