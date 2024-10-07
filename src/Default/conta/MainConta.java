package Default.conta;

public interface MainConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, MainConta contaDestino);
    void imprimirExtrato();
}
