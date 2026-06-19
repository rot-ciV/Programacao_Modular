
import java.util.Scanner;

public class Programa {
    
    public static void main(String args[]){

        int[] divisores = new int[10];
        int controle = 0;
        int numero;
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite um número");
        
        try {
            numero = leitor.nextInt();
        } catch (Exception e) {
            System.out.println("Erro ao ler o núumero");
            leitor.close();
            return;
        }

        for(int i = 1; i <= numero; i++){

            if(numero % i == 0){
                try {
                    divisores[controle] = i;
                    controle++;
                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.print("Os 10 primeiros divisores de " + numero + " são:");
                    for(int j = 0; j < 10; j++){
                        System.out.print(" "+divisores[j]);
                    }
                    System.out.print("\n");
                    System.out.println("Ainda teria mais divisores.");
                    leitor.close();
                    return;
                }
            }
        }

        System.out.print("Os divisores de " + numero + " são:");

        for(int i = 0; i < controle; i++) {
            System.out.print(" "+divisores[i]);
        }
        System.out.println();
        leitor.close();
    }
}
