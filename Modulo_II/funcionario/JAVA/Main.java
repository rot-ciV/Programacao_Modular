class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Bufos Regularis", "bufinho.games@gmail.com");
        Assistente assistente = new Assistente("Bombina", "bombina.lifestyle@hotmail.com", 123456);
        Tecnico tecnico = new Tecnico("Cururu", "cururu.beiradorio@outlook.com", 10, 900.99);
        Administrativo administrativo = new Administrativo("Sapo", "naolavomeupedasilva@ufsj.com", 100, "Noite", 200.00);

        System.out.println(funcionario.exibeDados());    
        System.out.println(assistente.exibeDados());
        System.out.println(tecnico.exibeDados());
        System.out.println(administrativo.exibeDados()); 
   }    
}