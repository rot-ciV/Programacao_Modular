class Tecnico extends Assistente {

    private double bonusSalario;

    public Tecnico() {}

    public Tecnico(String nome, String email, int matricula, double bonus){

        super(nome, email, matricula);
        bonusSalario = bonus;
    }

    public void setBonusSalario(double bonus) { bonusSalario = bonus; }
    public double getBonusSalario() { return bonusSalario; }

    @Override
    public String exibeDados(){

        return super.exibeDados() + " | Bonus salarial: " + bonusSalario;
    }
}