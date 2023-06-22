import java.util.Locale;
import java.util.Scanner;
import java.util.Locale; 

public class Metodos {

    public static double somar(Double a, Double b) {
        return (a + b);
    }

    public static void main(String[] args) {
        double numero1;
        double numero2;
        double total;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();

        
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextDouble();
        total=somar(numero1, numero2);
        
        System.out.println("Total:" + total);

    }

}