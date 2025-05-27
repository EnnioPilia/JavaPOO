package JavaPo;

public class TestCompteBancaire {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);
        compte.deposer(500);       
        compte.retirer(2000);      
        compte.retirer(300);      
        System.out.println("Solde final : " + compte.getSolde()); 
    }
}
