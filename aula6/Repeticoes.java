import java.util.Scanner;

public class Repeticoes {
    public static void main(String[] args) {

        int op = 0;

        do {
            System.out.println("Digite um valor qualquer ou 99 para sair: ");
            Scanner entrada = new Scanner(System.in);
            op = entrada.nextInt();

        } while (op != 99);
    }

}