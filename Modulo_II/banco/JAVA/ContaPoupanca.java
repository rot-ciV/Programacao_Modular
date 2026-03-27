class ContaPoupanca extends ContaBancaria {

    private float taxaRendimento;

    public ContaPoupanca() {}

    public ContaPoupanca(String cliente, int numConta, float saldo, float taxaRendimento){

        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public float getSaldo() {

        saldo = saldo + (saldo * taxaRendimento);
        return saldo;
    }
}