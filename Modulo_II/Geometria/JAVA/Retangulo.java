class Retangulo extends Geometria{

    protected double base;
    protected double altura;

    public Retangulo(){

        super();
        base = 0.0;
        altura = 0.0;
    }

    public Retangulo(double base, double altura){

        super();
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public double perimetro(){

        return (2 * base) + (2 * altura);
    }

    @Override
    public double area(){

        return base * altura;
    }

    @Override
    public String toString(){

        return "Base: " + base + " | Altura: " + altura + " | Perimetro: " + perimetro() + " | Area: " + area(); 
    }
}