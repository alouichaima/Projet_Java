package gestion;


public class employée {
	private int idEmp;
	private String nom;
	private String prenom;
	private String sexe;
	private int age;
	private String dn;
	private String Departement;
	private String adresse;
	private String email;
	private String telephone;


	
	
	 


	    public employée(int idEmp, String nom, String prenom, String sexe, int age, String dn, String departement,
			String adresse, String email, String telephone) {
		super();
		this.idEmp = idEmp;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.dn = dn;
		Departement = departement;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}




		public int getIdEmp() {
			return idEmp;
		}




		public void setIdEmp(int idEmp) {
			this.idEmp = idEmp;
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




		public String getSexe() {
			return sexe;
		}




		public void setSexe(String sexe) {
			this.sexe = sexe;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}




		public String getDn() {
			return dn;
		}




		public void setDn(String dn) {
			this.dn = dn;
		}




		public String getDepartement() {
			return Departement;
		}




		public void setDepartement(String departement) {
			Departement = departement;
		}




		public String getAdresse() {
			return adresse;
		}




		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}




		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getTelephone() {
			return telephone;
		}




		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

	


	
	
		public void modifierEmploye(String nom, String prenom, String sexe, int age, String dn, String departement, String adresse, String email, String telephone) {
		    this.nom = nom;
		    this.prenom = prenom;
		    this.sexe = sexe;
		    this.age = age;
		    this.dn = dn;
		    this.Departement = departement;
		    this.adresse = adresse;
		    this.email = email;
		    this.telephone = telephone;
		}




	
		
	
	

}
