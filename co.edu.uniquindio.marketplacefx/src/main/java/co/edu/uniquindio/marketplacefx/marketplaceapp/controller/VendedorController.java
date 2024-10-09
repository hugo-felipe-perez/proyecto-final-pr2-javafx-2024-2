package co.edu.uniquindio.marketplacefx.marketplaceapp.controller;

import co.edu.uniquindio.marketplacefx.marketplaceapp.factory.ModelFactory;
import co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.dto.VendedorDTO;

import java.util.List;

public class VendedorController {

    ModelFactory modelFactory;
    public VendedorController() {modelFactory = ModelFactory.getInstance();}

    public  List<VendedorDTO> obtenerVendedor() {
        return modelFactory.obtenerVendedores();
    }

    public void agregarVendedor(VendedorDTO vendedor) {
        modelFactory.agregarVendedor(vendedor);
    }

    public void actualizarVendedor(VendedorDTO vendedor) {
        modelFactory.actualizarVendedor(vendedor);
    }

    public void eliminarVendedor(String cedula) {
        modelFactory.eliminarVendedor(cedula);
    }
}
