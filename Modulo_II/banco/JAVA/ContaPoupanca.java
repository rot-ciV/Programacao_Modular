class ContaPoupanca extends ContaBancaria {

    private float taxaRendimento;

    public ContaPoupanca() {

        super();
        taxaRendimento = 0.0f;
    }

    public float getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(float taxaRendimento) { this.taxaRendimento = taxaRendimento; }

    public ContaPoupanca(String cliente, int numConta, float saldo, float taxaRendimento){

        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public float getSaldo() {

        saldo = saldo + (saldo * taxaRendimento);
        return saldo;
    }

    @Override
    public String toString(){

        return super.toString() + " | Taxa de Rendimento: " + taxaRendimento;
    }
}