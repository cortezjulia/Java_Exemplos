public class Cao {
    String nome;
    String cor;
    int idade;
    double peso;

public Cao() //construtor
{
    cor="Caramelo";
}
public Cao(String nome, int idade)
{
    this.idade=idade;
    this.nome=nome;
}


public void Anda () //Metodo
{
    System.out.println("Pode andar cachorrinho "+cor);
}
public void DadosCao()//Metodo
{
    System.out.println("O meu cachorro se chama "+nome+", ele tem "+idade+" anos.");
}
}