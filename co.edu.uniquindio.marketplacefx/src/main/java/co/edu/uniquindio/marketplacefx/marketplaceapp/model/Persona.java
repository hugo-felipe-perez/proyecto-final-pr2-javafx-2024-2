package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder.PersonaBuilder;

public class Persona {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contraseña;
    private Usuario usuarioAsociado;
    private Rol rol;

    public Persona(String nombres,
                   String apellidos,
                   String cedula,
                   String direccion,
                   String usuario,
                   String contraseña,
                   Usuario usuarioAsociado,
                   Rol rol) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.usuarioAsociado = usuarioAsociado;
        this.rol = rol;
    }

    public Persona() {
    }

    public static PersonaBuilder builder(){
        return new PersonaBuilder();
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Usuario getUsuarioAsociado() {
        return usuarioAsociado;
    }

    public Rol getRol() {
        return rol;
    }

}
