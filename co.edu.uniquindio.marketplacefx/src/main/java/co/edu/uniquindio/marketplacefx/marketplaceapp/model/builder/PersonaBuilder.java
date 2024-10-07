package co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Persona;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Usuario;

public class PersonaBuilder {

    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contraseña;
    private Usuario usuarioAsociado;
    private Rol rol;

    public PersonaBuilder nombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public PersonaBuilder apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public PersonaBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public PersonaBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PersonaBuilder usuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public PersonaBuilder contraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    public PersonaBuilder usuarioAsociado(Usuario usuarioAsociado) {
        this.usuarioAsociado = usuarioAsociado;
        return this;
    }

    public PersonaBuilder rol(Rol rol) {
        this.rol = rol;
        return this;
    }

    public Persona build(){
        return new Persona(nombres,apellidos,cedula,direccion,usuario,contraseña,usuarioAsociado,rol);
    }
}
