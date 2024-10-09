package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder.PersonaBuilder;

public abstract class Persona {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contraseña;
    private Rol rol;

    public Persona(String nombres,
                   String apellidos,
                   String cedula,
                   String direccion,
                   String usuario,
                   String contraseña,
                   Rol rol) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Persona() {
    }

    protected Persona(String nombres, String apellidos, String cedula, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
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
    
    
    public Rol getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", rol=" + rol +
                '}';
    }
}
