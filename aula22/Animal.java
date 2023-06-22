public class Animal {
    private String nome;

    public void SetNome(String n) {
        nome = n;
    }

    public String GetNome() {
        return nome;
    }

    public void Comer() {
        System.out.println("Eu gosto de comer!");
    }
}
