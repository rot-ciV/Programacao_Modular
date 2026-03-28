class Main{

    public static void main(String[] args) {
        
        Geometria[] formas = new Geometria[2];

        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(10, 5.5);

        System.out.println(formas[0].toString());
        System.out.println(formas[1].toString());
    }
}