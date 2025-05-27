package JavaPo;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

        public Personne (String nom,String prenom,int age){
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
        }
       public void sePresenter(Personne personnage) {
        System.out.println(" je m'appelle  " + this.nom + this.prenom + " j'ai " + this.age);

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

    // SETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




