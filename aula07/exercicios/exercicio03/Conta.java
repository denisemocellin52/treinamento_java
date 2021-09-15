public class Conta {
    private int numero;
    private double saldo;

    public Conta(){
        }

    public Conta (int numero) {
        this.numero = numero;
        this.saldo = 0;
    }
    
    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean deposito(double valor){
        if(valor > 0) { //saldo = saldo + valor
        saldo += valor; //mesma abreviada
        return true;
    }
    return false;
    
    }
    public boolean sacar(double valor){
        if(valor > 0) { //saldo = saldo + valor
        saldo += valor; //mesma abreviada
        return true;
    }
    return false;
}

    @Override
    public String toString(){
        return numero + ": " + saldo;
    }
}