package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder.VendedorBuilder;

public class Vendedor extends Persona {


    public Vendedor(String nombres, String apellidos, String cedula, String direccion, String usuario, String contraseña, Rol rol) {
        super(nombres, apellidos, cedula, direccion, usuario, contraseña, rol);

    }

    // Método estático para acceder al builder de Vendedor
    public static VendedorBuilder builder() {
        return new VendedorBuilder();
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombres='" + getNombres() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", usuario='" + getUsuario() + '\'' +
                ", contraseña='" + getContraseña() + '\'' +
                ", rol=" + getRol() +
                '}';
    }
}
