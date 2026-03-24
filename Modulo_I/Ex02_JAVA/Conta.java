class Conta {

    private int numero;
    private double saldo;

    public Conta(){

        this.numero = 0;
        this. saldo = 0.0;
    }

    public Conta(int numero, double saldo){

        this.numero = numero;
        this.saldo = saldo;
    }

    public void setNumero(int numero) { this.numero = numero; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public int getNumero() { return this.numero; }
    public double getSaldo() { return this.saldo; }

    public void depositar(double deposito){

        this.saldo = this.saldo + deposito;
    }

    public void sacar(double saque){

        if(saque > this.saldo) return;

        this.saldo = this.saldo - saque;
    }

    public double conferir(){

        return this.saldo;
    }

    
}