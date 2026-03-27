class Assistente extends Funcionario {

    private int matricula;

    public Assistente() {}

    public Assistente(String nome, String email, int matricula){

        super(nome, email);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) { this.matricula = matricula; }
    public int getMatricula() { return matricula; }

    @Override
    public String exibeDados(){

        return super.exibeDados() + " | Matricula: " + this.matricula;
    }

}