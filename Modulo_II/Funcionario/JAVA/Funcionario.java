class Funcionario {

    private String nome;
    private String email;

    public Funcionario() {}

    public Funcionario(String nome, String email){

        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }

    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public String exibeDados(){

        return "Nome: " + this.nome + " | Email: " + this.email;
    }

    
}

