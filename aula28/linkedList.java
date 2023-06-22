import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<>();

        animais.add("gato");
        animais.add("cachorro");
        animais.add("cavalo");
        System.out.println(animais);
        animais.add(2,"coruja");
        System.out.println(animais);

    }
}