import java.util.Scanner;

public class MultiplaEscolha {
    public static void main(String[] args) {

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar alunos");
        System.out.println("2 - Cadastrar notas");
        System.out.println("3 - Listar alunos e notas");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Vamos cadastrar alunos: ");
                break;
            case 2:
                System.out.println("Vamos cadastrar notas: ");
            case 3:
                System.out.println("Vamos listar: ");
            default:
                System.out.println("O número é inválido");
        }
    }

}