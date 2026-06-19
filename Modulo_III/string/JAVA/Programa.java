import java.util.Scanner;

public class  Programa {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra_UM = leitor.nextLine();

        System.out.println("Digite outra palavra:");
        String palavra_DOIS = leitor.nextLine();

        int resultado;

        try {
            resultado = palavra_UM.compareTo(palavra_DOIS);
        } catch (NullPointerException e) {
            System.out.println("Erro ao comparar as palavras");
            leitor.close();
            return;
        }
        if(resultado > 0){
            System.out.println("A palavra \"" + palavra_UM + "\" é lexicograficamente maior do que a palavra \"" + palavra_DOIS + "\".");
        }
        else if(resultado < 0){
            System.out.println("A palavra \"" + palavra_DOIS + "\" é lexicograficamente maior do que a palavra \"" + palavra_UM + "\".");
        }
        else{
            System.out.println("As duas palavras são iguais, logo as duas são lexicograficamente idênticas."); 
        }
        
        leitor.close();
    }
}
