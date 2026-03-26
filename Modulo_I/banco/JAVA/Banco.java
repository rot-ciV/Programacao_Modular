
import java.util.ArrayList;
import java.util.List;

class Banco {

    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {return contas;}

    public void adicionaConta(Conta conta_cliente){

        contas.add(conta_cliente);
    }
}