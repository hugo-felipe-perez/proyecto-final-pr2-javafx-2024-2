package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import java.util.ArrayList;
import java.util.List;

public class Marketplace {
    private List<Vendedor> listaVendedores;
    private List<Administrador> listaAdministradores;
    private List<Usuario> listaUsuarios;

    public Marketplace() {
        this.listaVendedores = new ArrayList<>();
        this.listaAdministradores = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public List<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    @Override
    public String toString() {
        return "Marketplace{" +
                "listaVendedores=" + listaVendedores +
                ", listaAdministradores=" + listaAdministradores +
                ", listaUsuarios=" + listaUsuarios +
                '}';
    }

    private Vendedor obtenerVendedores(String cedula) {
        for (Vendedor vendedor : getListaVendedores()) {
            if (vendedor.getCedula().equals(cedula)) {
                return vendedor;
            }
        }
        return null;
    }

    public void agregarVendedor(Vendedor vendedor) {
        if (obtenerVendedores(vendedor.getCedula()) != null) {
            throw new IllegalArgumentException("Ya existe un vendedor con esta cédula");
        }
        this.listaVendedores.add(vendedor);
    }

    public void eliminarVendedor(String cedula) {
        Vendedor vendedor = obtenerVendedores(cedula);
        if (vendedor != null) {
            listaVendedores.remove(vendedor);
        } else {
            throw new IllegalArgumentException("Vendedor no encontrado");
        }
    }

    public void actualizarVendedor(Vendedor vendedorActualizado) {
        Vendedor vendedorExistente = obtenerVendedores(vendedorActualizado.getCedula());
        if (vendedorExistente != null) {
            listaVendedores.set(listaVendedores.indexOf(vendedorExistente), vendedorActualizado);
        } else {
            throw new IllegalArgumentException("Vendedor no encontrado");
        }
    }
}
