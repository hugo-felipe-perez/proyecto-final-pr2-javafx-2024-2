package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder.AdministradorBuilder;

public class Administrador extends Persona{

    public Administrador(String nombres,
                         String apellidos,
                         String cedula,
                         String direccion,
                         String usuario,
                         String contraseña,
                         Usuario usuarioAsociado, Rol rol) {super(nombres, apellidos, cedula, direccion, usuario, contraseña, rol);
    }

    public Administrador() {
    }

    public static AdministradorBuilder builder(){
        return new AdministradorBuilder();
    }
}
