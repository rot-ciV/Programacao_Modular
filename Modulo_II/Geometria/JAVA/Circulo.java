class Circulo extends Geometria {

    protected double raio;

    public Circulo() {

        super();
        raio = 0.0;
    }

    public Circulo(double raio){

        super();
        this.raio = raio;
    }

    public void setRaio(double raio) { this.raio = raio; }
    public double getRaio() { return raio; }

    @Override
    public double perimetro(){

        return 2 * Math.PI * raio;
    }

    @Override
    public double area(){

        return Math.PI * raio * raio;
    }

    @Override
    public String toString(){

        return "Raio: " + raio + " | Perimetro: " + perimetro() + " | Area: " + area();
    }

    
}