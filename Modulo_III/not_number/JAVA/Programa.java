import java.util.Scanner;

public class Programa {
    
    public static void main(String args[]) throws ItsNotANumberException {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String palavra = leitor.nextLine();

        try {
            Double.parseDouble(palavra);

        } catch (NumberFormatException e) {
            throw new ItsNotANumberException("Eu disse para você digitar um número.");

        } finally{
            leitor.close();
        }
        
        System.out.println("Você realmente digitou um número!");
    }
}
