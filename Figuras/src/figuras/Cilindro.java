package figuras;

public class Cilindro extends FiguraGeometrica {
    private double radio;
    private double altura;
    
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.contructorVolumen(VolumenCilindro());
        this.contructorSuperficie(SuperficieCilindro());
    }
    
    public double VolumenCilindro() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;
    }
    
    public double SuperficieCilindro() {
        double áreaLadoA = 2.0 * Math.PI * radio * altura;
        double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return áreaLadoA + áreaLadoB;
    }
}
