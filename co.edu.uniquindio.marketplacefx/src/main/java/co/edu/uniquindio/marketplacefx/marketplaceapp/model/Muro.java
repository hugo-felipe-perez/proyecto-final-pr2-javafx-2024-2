package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import java.util.ArrayList;
import java.util.List;

public class Muro {

    private List <Mensaje> listaMensajes = new ArrayList<>();
    private List <Publicacion> listaPublicaciones = new ArrayList<>();

    public Muro() {
    }

    public List<Mensaje> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(List<Mensaje> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }

    public List<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(List<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }
}
