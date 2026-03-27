abstract class ContaBancaria{

    protected String cliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria() {

        super();
        cliente = "";
        numConta = 0;
        saldo = 0.0f;
    }

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

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setNumConta(int numConta) { this.numConta = numConta; }
    public void setSaldo(float saldo) { this.saldo = saldo; }

    public String getCliente() { return cliente; }
    public int getNumConta() { return numConta; }
    public abstract float getSaldo();

    @Override
    public String toString(){

        return "Cliente: " + cliente + " | Número da Conta: " + numConta + " | Saldo: R$ " + saldo;
    }
}