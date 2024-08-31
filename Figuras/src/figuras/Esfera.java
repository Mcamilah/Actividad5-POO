package figuras;

public class Esfera extends FiguraGeometrica {
    private double radio;
    
    public Esfera(double radio) {
        this.radio = radio;
        this.contructorVolumen(VolumenEsfera());
        this.contructorSuperficie(SuperficieEsfera());
    }
    
    public double VolumenEsfera() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return volumen;
    }
    
    public double SuperficieEsfera() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return superficie;
    }
}
