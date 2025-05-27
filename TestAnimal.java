package JavaPo;

public class TestAnimal {
 public static void main(String[] args) {
        Animal[] animaux = { new Chien(), new Chat() };
            for (Animal a : animaux) {
            a.crier(); 
        }
    }
}
