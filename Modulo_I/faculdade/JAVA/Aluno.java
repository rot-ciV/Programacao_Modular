class Aluno {

    private int registro;
    private String nome;

    public Aluno(){}

    public Aluno(int registro, String nome){

        this.registro = registro;
        this.nome = nome;
    }

    public int getRegistro() { return registro; }
    public String getNome() { return nome; }

    public void setRegistro(int registro) { this.registro = registro; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString(){

        return "Registro: " + this.registro + " | Nome: " + this.nome;
    }

    
}