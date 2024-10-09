package co.edu.uniquindio.marketplacefx.marketplaceapp.utils;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Marketplace;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Usuario;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Vendedor;


public class DataUtil {

    public static Marketplace inicializarDatos() {

        Marketplace marketplace = new Marketplace();

        Vendedor vendedor1 = Vendedor.builder()
                .nombres("Roberto Antonio")
                .apellidos("Perez Lopez")
                .cedula("120912")
                .direccion("loma 2 casa #25")
                .usuario("rober0_02")
                .contraseña("821218")
                .rol(Rol.VENDEDOR)
                .build();

        Usuario usuario1 = Usuario.builder()
                .usuario(vendedor1.getUsuario())
                .contraseña(vendedor1.getContraseña())
                .build();

        Vendedor vendedor2 = Vendedor.builder()
                .nombres("Juan Esteban")
                .apellidos("Pacho Lopez")
                .cedula("129810912")
                .direccion("manzana 3 casa #5")
                .usuario("Juan_02")
                .contraseña("83238")
                .rol(Rol.VENDEDOR)
                .build();

        Usuario usuario2 = Usuario.builder()
                .usuario(vendedor2.getUsuario())
                .contraseña(vendedor2.getContraseña())
                .build();

        marketplace.getListaVendedores().add(vendedor1);
        marketplace.getListaVendedores().add(vendedor2);

        return marketplace;
    }
}