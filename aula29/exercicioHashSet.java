import java.util.HashSet;
import java.util.Iterator;

public class exercicioHashSet {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}