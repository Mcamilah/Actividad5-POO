
package figuras;

public class FiguraGeometrica {
    private double volumen;
    private double superficie;
    
    public void contructorVolumen(double volumen) {
        this.volumen = volumen;
    }
    public void contructorSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public double Volumen() {
        return this.volumen;
    }
    public double Superficie() {
        return this.superficie;
    }
}

