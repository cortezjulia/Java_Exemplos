import java.rmi.dgc.DGC;

abstract class Conta {
    private double saldo;

    public void SetSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double GetSaldo() {
        return saldo;
    }

    public abstract void ImprimeExtrato();
}
