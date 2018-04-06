/*
Marielos Alejandra Najarro Alvarez 00126816
 */
package tienda;

/**
 *
 * @author marielos
 */
public class Administrador {

    private String nombreUsuario;
    private int contraUsuario;

    public Administrador(String nombreUsuario, int contraUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contraUsuario = contraUsuario;
    }

    public String setNombreUsuario() {
        return nombreUsuario;
    }

    public int setContraUsuario() {
        return contraUsuario;
    }

    public void getNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void getContraUsuario(int contraUsuario) {
        this.contraUsuario = contraUsuario;
    }
}
