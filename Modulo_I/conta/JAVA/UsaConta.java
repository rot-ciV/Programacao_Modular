class UsaConta {

    public UsaConta() {}

    public static void main(String[] args) {
        
        Conta conta = new Conta(123, 0.0);
        ContaInterface menuInterface = new ContaInterface();

        menuInterface.Menu(conta);

    }

    
}