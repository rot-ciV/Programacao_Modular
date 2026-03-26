class UsaBanco {

    public UsaBanco(){}

    public static void main(String[] args) {
        
        Banco banco = new Banco();
        BancoInterface programa = new BancoInterface(banco);
        programa.menu();
    }
}