package co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder;

import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Muro;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Producto;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Usuario;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class VendedorBuilder {

    private List<Producto> productos = new ArrayList<>();
    private List <Vendedor> vendedoresAliados = new ArrayList<>();
    private Muro muro;

    public VendedorBuilder productos(List<Producto> productos) {
        this.productos = productos;
        return this;
    }

    public VendedorBuilder vendedoresAliados(List<Vendedor> vendedoresAliados) {
        this.vendedoresAliados = vendedoresAliados;
        return this;
    }

    public VendedorBuilder muro(Muro muro) {
        this.muro = muro;
        return this;
    }

    public Vendedor build() {
        return new Vendedor(productos,vendedoresAliados,muro);
    }

}
