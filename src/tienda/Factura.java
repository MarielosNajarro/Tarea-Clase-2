/*
 Marielos Alejandra Najarro Alvarez 00126816
 */
package tienda;

/**
 *
 * @author marielos
 */
public class Factura {

    private int cantidadProductos;
    private double total;

    public Factura(int cantidadProductos, double total) {
        this.cantidadProductos = cantidadProductos;
        this.total = total;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public void setTota(double total) {
        this.total = total;
    }
}
