import java.util.ArrayList;
import java.util.List;

class Matricula {

    private int numero;
    private String data;
    private Aluno aluno;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Matricula(){}

    public Matricula(int numero, String data, Aluno aluno){

        this.numero = numero;
        this.data = data;
        this.aluno = aluno;
    }

    public int getNumero() { return numero; }
    public String getData() { return data; }
    public Aluno getAluno() { return aluno; }

    public void setNumero(int numero) { this.numero = numero; }
    public void setData(String data) { this.data = data; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public void addDisciplina(Disciplina d){

        disciplinas.add(d);
    }

    public double calculaTotal(){

        double total = 0.0;
        for(Disciplina disciplina_atual : this.disciplinas){

            total = total + disciplina_atual.getValor();
        }

        return total;
    }

    @Override
    public String toString(){

        return "Número: " + this.numero + " | Data: " + this.data + " | Aluno: " + this.aluno + " | Valor total: " + calculaTotal();
    } 
}