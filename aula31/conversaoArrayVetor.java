import java.lang.reflect.Array;
import java.util.ArrayList;

public class conversaoArrayVetor {
    public static void main(String[] args) {

        ArrayList<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Julia");
        linguagens.add("Python");
        linguagens.add("C");
        linguagens.add("Javascript");

        System.out.println("Linguagens: " + linguagens);

        // criar vetor
        String[] vet = new String[linguagens.size()];

        linguagens.toArray(vet);
        System.out.println("ArrayList convertido para um vetor: ");

        for (String item : vet) {

        
                System.out.print(item + " ");
            
        }

    }
}