/*
Marielos Alejandra Najarro Alvarez 00126816
 */
package tienda;

/**
 *
 * @author marielos
 */
public class Proveedor {

    private String nombreProveedor;
    private int numeroProveedor;
    private String nombreEmpresa;

    public Proveedor(String nombreProveedor, int numeroProveedor, String nombreEmpresa) {
        this.nombreProveedor = nombreProveedor;
        this.numeroProveedor = numeroProveedor;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreProovedor() {
        return nombreProveedor;
    }

    public int getNumeroProovedor() {
        return numeroProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setNumeroProveedor(int numeroProveedor) {
        this.numeroProveedor = numeroProveedor;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
