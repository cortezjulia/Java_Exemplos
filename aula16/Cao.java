import java.util.Set;

class Cao {
    private int idade;

    public void setIdade(int i) {
        idade = i;
    }

    public int getIdade() {
        return idade;
    }

    public boolean VerificarIdade() {
        if (idade > 10) {
            return true;
        } else {
            return false;
        }
    }

    public void exibir() {
        System.out.printf("A idade é: %d", getIdade());

    }

}
