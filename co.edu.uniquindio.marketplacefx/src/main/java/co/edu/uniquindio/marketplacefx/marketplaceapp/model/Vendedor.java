package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona{

    private List <Producto> productos = new ArrayList<>();
    private List <Vendedor> vendedoresAliados = new ArrayList<>();
    private Muro muro;

    public Vendedor(String nombres,
                    String apellidos,
                    String cedula,
                    String direccion,
                    String usuario,
                    String contraseña,
                    Usuario usuarioAsociado,
                    Rol rol,
                    List<Producto> productos,
                    List<Vendedor> vendedoresAliados,
                    Muro muro) {
        super(nombres, apellidos, cedula, direccion, usuario, contraseña, usuarioAsociado, rol);
        this.productos = productos;
        this.vendedoresAliados = vendedoresAliados;
        this.muro = muro;
    }

    public Vendedor(List<Producto> productos,
                    List<Vendedor> vendedoresAliados,
                    Muro muro) {
        this.productos = productos;
        this.vendedoresAliados = vendedoresAliados;
        this.muro = muro;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Vendedor> getVendedoresAliados() {
        return vendedoresAliados;
    }

    public Muro getMuro() {
        return muro;
    }
}
