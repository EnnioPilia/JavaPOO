package JavaPo;

public class TestEmploye {
    public static void main(String[] args) {
        Employe e1 = new Salarie("Alice", 3000);
        Employe e2 = new Freelance("Bob", 120, 20);

        System.out.println("Salaire de " + e1.nom + " : " + e1.calculerSalaire() + " €");
        System.out.println("Salaire de " + e2.nom + " : " + e2.calculerSalaire() + " €");
    }
}
