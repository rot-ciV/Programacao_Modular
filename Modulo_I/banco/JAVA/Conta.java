class Conta{

    private int numero;
    private double saldo;

    public Conta(){

        numero = 0;
        saldo = 0.0;
    }

    public Conta(int numero, double saldo){

        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double conferir(){

        return this.saldo;
    }

    public void sacar(double saque){

        if(saque > saldo) return;
        saldo = saldo - saque;
    }

    public void depositar(double deposito){

        saldo += deposito;
    }
}