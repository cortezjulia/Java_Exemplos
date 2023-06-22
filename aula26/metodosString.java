import javax.print.DocFlavor.STRING;

public class metodosString {
    public static void main(String[] args) {

        String primeira = "Python";
        String segunda = "CSS";
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());// letras maiusculas
        System.out.println(segunda.length());// tamanho
        System.out.println(terceira);

        // comparação de strings
        boolean resultado = primeira.equals(segunda);
        System.out.println("A primeira é igual a segunda? " + resultado);
        resultado = primeira.equals(terceira);
        System.out.println("A primeira é igual a terceira? " + resultado);
    }
}
