package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder.PersonaBuilder;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder.UsuarioBuilder;

public class Usuario{

    private String usuario;
    private String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean autenticar(String nombreUsuario, String contrasena) {
        return this.usuario.equals(nombreUsuario) && this.contraseña.equals(contrasena);
    }
}
