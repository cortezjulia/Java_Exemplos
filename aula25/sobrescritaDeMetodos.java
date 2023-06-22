public class sobrescritaDeMetodos {
    // enquanto na sobrecarga usa-se o mesmo nome de metodo, mas com parametros de
    // entrada diferentes
    // na sobrescrita os metodos sao a declaracao identica, porem com conteudo
    // diferente

    public static void main(String[] args) {

        Java j1 = new Java();
        Linguagem l1 = new Linguagem();

        j1.Apresenta_linguagem();
        l1.Apresenta_linguagem();
    }
}