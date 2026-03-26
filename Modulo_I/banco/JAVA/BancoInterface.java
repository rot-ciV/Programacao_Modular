import java.util.Scanner;

class BancoInterface{

    private Banco banco;

    public BancoInterface(Banco banco) {

        this.banco = banco;
    }

    public void menu(){

        Scanner teclado = new Scanner(System.in);
        
        while (true) { 
            
            System.out.println("---MENU---");
            System.out.println("01: Abrir nova conta");
            System.out.println("02: Selecionar conta");
            System.out.println("03: Sair");

            int acao = teclado.nextInt();

            switch (acao){

                case 1 -> {

                    System.out.println("Digite o número da nova conta:");
                    int numero = teclado.nextInt();
                    System.out.println("Digite o saldo da nova conta:");
                    double saldo = teclado.nextDouble();

                    Conta conta_cliente = new Conta(numero, saldo);
                    banco.adicionaConta(conta_cliente);

                    System.out.println("Conta criada com sucesso");
                }

                case 2 -> {

                    System.out.println("Digite o número da conta:");
                    int numero = teclado.nextInt();
                    Conta conta_encontrada = null;

                    for(Conta conta_atual : banco.getContas()){

                        if(conta_atual.getNumero() == numero){

                            conta_encontrada = conta_atual;
                            break;
                        }
                    }

                    if(conta_encontrada == null){

                        System.out.println("Não exite conta com esse número");

                    }else{

                        ContaInterface menu = new ContaInterface();
                        menu.Menu(conta_encontrada);
                    }  
                }

                case 3 -> {

                    return;
                }

                default -> System.out.println("Opcão Inválida");
            }
        }
    }
}