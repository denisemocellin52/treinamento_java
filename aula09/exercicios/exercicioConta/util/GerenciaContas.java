package exercicioConta.util;
import java.util.HashMap;
import exercicioConta.entidades.Conta;
import exercicioConta.entidades.ContaCorrente;
import exercicioConta.entidades.ContaEspecial;
import exercicioConta.entidades.ContaPoupanca;

// ALT + SHIFT + O = arruma os import's

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        ContaCorrente cc = new ContaCorrente(numeroConta);
        contas.put(numeroConta, cc);
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public String exibirSaldo(int numeroConta) {
        Conta conta = contas.get(numeroConta);
        if( conta != null) {
            return "conta: " + conta;
        }
        return "Conta não existe.";
    }

    public boolean deposito(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        if( conta != null) {
            return conta.deposito(valor);
        }
        return false; // não achou a conta
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        if( conta != null) {
            return conta.sacar(valor);
        }
        return false; // não achou a conta
    }

}