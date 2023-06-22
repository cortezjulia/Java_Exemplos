import java.util.ArrayList;
import java.util.Iterator;

public class usoIterator {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);

        System.out.println("Números da lista: " + numeros);

        Iterator<Integer> it = numeros.iterator();

        int numero = it.next();// Returns the next element in the iteration.
        numero = it.next();

        System.out.println("Elemento: " + numero);

        while (it.hasNext()) {
            it.forEachRemaining((value) -> System.out.println(value + ","));
        }

    }
}