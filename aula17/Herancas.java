public class Herancas {
     public static void main(String[] args) {
        Pessoa pessoinha=new Pessoa();
        pessoinha.nome="Ju";
        pessoinha.rg="1116264696";
        //pessoinha.comissao=8.4; erro pq o atributo comissão pertence só a classe Vendedor

        Vendedor vendedorzinho=new Vendedor();
        vendedorzinho.nome="Nicolas";
        vendedorzinho.comissao=100.00;



}
}