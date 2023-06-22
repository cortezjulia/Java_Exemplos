import java.util.Scanner;

public class TratoExcecoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite um valor numérico inteiro: ");
            int numero = entrada.nextInt();
            System.out.printf("Você digitou o número %d", numero);

        } catch (Exception ex) {
            System.out.println("ERRO - Valor não é um número inteiro.");
        }
    }
}
