class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial(){

        super();
        limite = 0.0f;
    }

    public void setLimite(float limite) { this.limite = limite; }
    public float getLimite() { return limite; }
    
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

    @Override
    public String toString(){

        return super.toString() + " | Limite: " + limite;
    }
}