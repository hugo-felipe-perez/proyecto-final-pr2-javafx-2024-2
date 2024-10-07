package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import java.util.ArrayList;
import java.util.List;

public class Marketplace {

    private List <Vendedor> listaVendedores = new ArrayList<>();
    private List <Administrador> listaAdministradores = new ArrayList<>();
    private List <Usuario> listaUsuarios = new ArrayList<>();

    public Marketplace() {
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public List<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(List<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    @Override
    public String toString() {
        return "Marketplace{" +
                "listaVendedores=" + listaVendedores +
                ", listaAdministradores=" + listaAdministradores +
                ", listaUsuarios=" + listaUsuarios +
                '}';
    }
}
