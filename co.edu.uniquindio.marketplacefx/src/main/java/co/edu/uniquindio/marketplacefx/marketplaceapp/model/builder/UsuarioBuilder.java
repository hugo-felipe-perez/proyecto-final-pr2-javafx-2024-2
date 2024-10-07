package co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder;

import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Usuario;

public class UsuarioBuilder {

    private String usuario;
    private String contraseña;

    public UsuarioBuilder usuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public UsuarioBuilder contraseña(String contraseña){
        this.contraseña = contraseña;
        return this;
    }

    public Usuario build() {
        return new Usuario(usuario,contraseña);
    }
}
