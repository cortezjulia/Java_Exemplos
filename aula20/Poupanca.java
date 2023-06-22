public class Poupanca implements Conta {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    public void sacar(double valor) {
        this.saldo -= valor;
       

    }
     public double getSaldo() {
        System.out.println("O depósito feito é de: "+saldo);
        return this.saldo;
        
    }
}
