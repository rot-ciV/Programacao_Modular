class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial(){}
    
    public ContaEspecial(String cliente, int numConta, float saldo, float limite){

        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public float getSaldo(){

        return saldo;
    }

    @Override
    public boolean sacar(float saque){

        if(saldo - saque < limite*-1) return false;

        saldo -= saque;
        return true;
    }
}