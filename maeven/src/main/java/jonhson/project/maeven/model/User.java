package jonhson.project.maeven.model;

public class User {
     String nom;
	 String prenom;
	 int age;
     String adresse;
     String contact;
     String email;
    
  



	public User(String nom, String prenom, int age, String adresse, String contact, String email) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
    	this.prenom=prenom;
    	this.age=age;
    	this.adresse=adresse;
    	this.contact=contact;
    	this.email=email;
	}





	public String getNom() {
    	return nom;
    }
    public String getPrenom() {
    	return prenom;
    }
    public int getAge() {
    	return age;
    }
    public String getAdresse() {
    	return adresse;
    }
    public String getContact() {
    	return contact;
    }
    public String getEmail() {
    	return email;
    }
    
    public void setNom(String nom) {
    	this.nom=nom;
    }
    public void setPrenom(String prenom) {
    	this.prenom=prenom;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public void setAdresse(String adresse) {
    	this.adresse=adresse;
    }
    public void setContact(String contact) {
    	this.contact=contact;
    }
    public void setEmail(String email) {
    	this.email=email;
    }
}
