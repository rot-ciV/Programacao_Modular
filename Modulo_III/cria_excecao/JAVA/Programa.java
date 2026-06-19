import java.util.Scanner;

public class Programa {

    public Programa() {
    }
    
    
    public int Fatorial(int numero) throws NegativosException{

        if(numero < 0){
            throw new NegativosException("O número fornecido é negativo!");
        }
        
        int resultado = 1;

        for(int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }

        return resultado;
    }

    public static void main(String args[]){

        Programa oi = new Programa();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        String resposta = leitor.nextLine();
        int numero, resultado;

        try {
            if(resposta.compareTo("") == 0){
                throw new StringVaziaException("Você digitou nada");
            }
            numero = Integer.parseInt(resposta);
            resultado = oi.Fatorial(numero);

        } catch (StringVaziaException e) {
            System.out.println("Erro: Você não digitou nada!");
            leitor.close();
            return;

        } catch (NumberFormatException e){
            System.out.println("Erro: Você deve digitar apenas números inteiros.");
            leitor.close();
            return;

        } catch (NegativosException e){

            System.out.println("Erro: Você deve digitar apenas números positivos.");
            leitor.close();
            return;
        }
        
        System.out.println("O fatorial de " + numero + " é "+ resultado);
        leitor.close();
    }
}
