import java.util.Scanner;

class ContaInterface {

    public ContaInterface(){}

    public void Menu(Conta conta_cliente){

        Scanner teclado = new Scanner(System.in);

        while (true) { 

            System.out.println("---Menu---");
            System.out.println("Digite o número referente a ação: ");
            System.out.println("01: Saldo");
            System.out.println("02: Depositar");
            System.out.println("03: Sacar");
            System.out.println("04: Sair");
            
            int acao = teclado.nextInt();      

            switch (acao){

                case 1 -> System.out.println("R$ "+conta_cliente.conferir());

                case 2 -> {

                    System.out.println("Digite a quantidade de dinheiro que gostaria de depositar: ");
                    double deposito = teclado.nextDouble();
                    conta_cliente.depositar(deposito);
                }
                    
                case 3 -> {

                    System.out.println("Digite a quantidade de dinheiro que gostaria de sacar:");
                    double saque = teclado.nextDouble();
                    conta_cliente.sacar(saque);
                }

                case 4 -> {

                    return; 
                }

                default -> System.out.println("Opção inválida");
                
            }

        }
    }
}