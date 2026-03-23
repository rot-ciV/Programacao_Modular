

public class NumeroComplexo{

    private int a;
    private int b;

    public NumeroComplexo(){

        a = 0;
        b = 0;
    }

    public NumeroComplexo(int a, int b){

        this.a = a;
        this.b = b;
    }

    public int getA() { return this.a; }
    public int getB() { return this.b; }

    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }

    public NumeroComplexo soma(NumeroComplexo num_somado){

        NumeroComplexo resultado = new NumeroComplexo();
        resultado.a = this.a + num_somado.a;
        resultado.b = this.b + num_somado.b;

        return resultado;
    }

    public NumeroComplexo produto(NumeroComplexo num_mult){

        NumeroComplexo resultado = new NumeroComplexo();
        resultado.a = (this.a * num_mult.a) - (this.b * num_mult.b);
        resultado.b = (this.b * num_mult.a) + (this.a * num_mult.b);

        return resultado;
    }

    public NumeroComplexo conjugado(){

        NumeroComplexo resultado = new NumeroComplexo(this.a, this.b * -1);

        return resultado;
    }

    public String toString(){

        
    }
}