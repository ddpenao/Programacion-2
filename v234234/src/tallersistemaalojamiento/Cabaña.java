
//BY DANIEL DAVID PEÑA ORTEGA

package tallersistemaalojamiento;

public class Cabaña extends Alojamiento {
    private static final double PRECIO_POR_CUARTO = 50000;
    private static final double DESCUENTO_POR_DIAS=0.1;
    private static final double LIMITE_DIAS_DESCUENTO=5;
    private int noCuartos;

    public Cabaña() {
    }

    public Cabaña(int noCuartos, int codigo, String direccion, String ciudad, String pais) {
        super(codigo, direccion, ciudad, pais);
        this.noCuartos = noCuartos;
    }

    public int getNoCuartos() {
        return noCuartos;
    }

    public void setNoCuartos(int noCuartos) {
        this.noCuartos = noCuartos;
    }

    @Override
    public String toString() {
        return "Cabaña:" 
                + super.toString()
                +"\n"+"noCuartos = " + noCuartos;
    }

    
    @Override
    public double calcularPrecioDia() {
        return this.noCuartos * Cabaña.PRECIO_POR_CUARTO;
    }

    @Override
    public double calcularDescuento(int noDias) {
       return (noDias>5)? Cabaña.DESCUENTO_POR_DIAS: 0;
    }
    
}
