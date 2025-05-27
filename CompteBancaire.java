package JavaPo;

public class CompteBancaire {
 private double solde;
 public CompteBancaire(double soldeInitial) {
 this.solde = soldeInitial;
 }
 public void deposer(double montant) {
    if (montant > 0){
        solde += montant;
    }else{
        System.out.println( montant + "est pas assez elevé pour deposer");
    }
}
  public void retirer(double montant) {
        if (montant > 0) {
            if (solde >= montant) {  
                solde -= montant;
            } else {
                System.out.println("Retrait impossible : solde insuffisant.");
            }
        } else {
            System.out.println(montant + " à retirer doit être positif.");
        }
    }
 public double getSolde() {
 return solde;
 }
}