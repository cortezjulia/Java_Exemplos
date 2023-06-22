import java.util.TreeSet;

public class usoTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        System.out.println("TreeSet:" + numeros);
        boolean resultado = numeros.remove(5);
        System.out.println("TreeSet:" + numeros);
        System.out.println("Apagaram? " + resultado);

        resultado = numeros.removeAll(numeros);
        System.out.println("TreeSet, apagando tudo: " + resultado);

    }
}