class Administrativo extends Assistente {

    private String turno;
    private double adicionalNoturno;

    public Administrativo() {}

    public Administrativo(String nome, String email, int matricula, String turno, double adicional){

        super(nome, email, matricula);
        this.turno = turno;
        adicionalNoturno = adicional; 
    }

    public void setTurno(String turno) { this.turno = turno; }
    public void setAdicionalNoturno(double adicional) { adicionalNoturno = adicional; }

    public String getTurno() { return turno; }
    public double getAdicionalNoturno() { return adicionalNoturno; }

    @Override
    public String exibeDados(){

        return super.exibeDados() + " | Turno: " + turno + " | Adicional Noturno: " + adicionalNoturno;
    }
}