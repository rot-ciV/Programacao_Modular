abstract class ContaBancaria{

    protected String cliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria() {}

    public ContaBancaria(String cliente, int numConta, float saldo){

        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public boolean sacar(float saque){

        if(saque > saldo) return false;

        saldo -= saque;
        return true;
    }

    public void depositar(float deposito){

        saldo += deposito;
    }

    public abstract float getSaldo();
}