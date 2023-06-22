import javax.crypto.spec.DESKeySpec;

interface Conta {
    void depositar(double valor);

    void sacar(double valor);

    double getSaldo();
}
