package metier;

public class User {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String pass;
	private int role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	public User() {
		this.email="";
		this.id=0;
		this.nom="";
		this.pass="";
		this.prenom="";
		this.role=0;
	}
	public User(String e, int i, int r, String n, String p, String pr) {
		this.email=e;
		this.id=i;
		this.nom=n;
		this.pass=p;
		this.prenom=pr;
		this.role=r;
	}
 
}
