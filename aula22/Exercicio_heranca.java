public class Exercicio_heranca {

    public static void main(String[] args) {

        Cao c = new Cao();
        // c.nome="Bidu"; Acesso direto não funciona pois é private
        c.SetNome("Maia");
        Gato g = new Gato();
        g.SetNome("Luna");

        c.Mostrar();
        g.Mostrar();
        c.Comer();
        g.Comer();
    }
}
