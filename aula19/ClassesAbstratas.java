public class ClassesAbstratas {

    //Por não permitir a instanciação de novos objetos com base em uma classe abstrata, 
    //este tipo de classe é utilizada para implementar o conceito de Herança da OO. Ou seja, 
    //as classes abstratas irão armazenar atributos e métodos comuns às classes que a irão herdar, 
    //permitindo um maior reaproveitamento de código.
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        cp.SetSaldo(5000);
        cp.ImprimeExtrato();
    }
}