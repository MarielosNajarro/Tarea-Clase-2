/*
Marielos Alejandra Najarro Alvarez 00126816
 */
package tienda;

/**
 * @author marielos
 */
public class Producto {

    private String nombreP;
    private double precioP;
    private int cantidadP;
    private boolean estadoP;

    public Producto(String nombreP, double precioP, int cantidadP, boolean estadoP) {
        this.nombreP = nombreP;
        this.precioP = precioP;
        this.cantidadP = cantidadP;
        this.estadoP = estadoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public boolean getEstadoP() {
        return estadoP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public void setEstadoP(boolean estadoP) {
        this.estadoP = estadoP;
    }

    public void cargarProducto(int nuevaCantidad) {
        this.cantidadP += nuevaCantidad;
    }

    public void descargarProducto(int nuevaCantidad) {
        if (this.cantidadP >= nuevaCantidad) {
            this.cantidadP -= nuevaCantidad;
        } else {
            System.out.println("Cantidad insuficiente");
        }
    }

    public void descartarProducto(int estadoP) {
        this.estadoP = false;
    }
}
