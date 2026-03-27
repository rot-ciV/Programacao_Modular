import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        ContaEspecial especial = new ContaEspecial("Ansonia Glandulosa Pereira", 123, 0.0f, 7000.0f);
        ContaPoupanca poupanca = new ContaPoupanca("Bufotes Siculus Almeida", 456, 0.0f, 0.0125f);

        System.out.println("Quanto gostaria de sacar, Sra Ansonia?");
        float saque = teclado.nextFloat();

        if(especial.sacar(saque)) System.out.println("Saque realizado com sucesso!");
        else System.out.println("Limite ultrapassado! Saque cancelado");

        System.out.println("Digite o valor do depósito, sr Bufotes:");
        float deposito = teclado.nextFloat();
        poupanca.depositar(deposito);
        System.out.println("O novo valor do saldo (saldo + taxa) é:");
        System.out.println("R$ " + poupanca.getSaldo());

        teclado.close();
    }
}