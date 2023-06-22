public class Printar {
    // sem parametro de entrada
    public void Mostrar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    // com um parametro
    public void Mostrar(String caractere) {
        for (int i = 0; i < 10; i++) {
            System.out.println(caractere);
        }
    }

    // com dois parametros
    public void Mostrar(String caractere, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(caractere);
        }
    }

}
