package Default;

import Default.cliente.Cliente;
import Default.conta.Conta;
import Default.conta.ContaCorrente;
import Default.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente joaoVitor = new Cliente();
        joaoVitor.setNome("Joao Vitor");

        Conta cc = new ContaCorrente(joaoVitor);
        Conta poupanca = new ContaPoupanca(joaoVitor);
        Conta corrente = new ContaCorrente(joaoVitor);

        cc.depositar(1000);
        cc.transferir(1000, poupanca);
        cc.transferir(1200, corrente);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}